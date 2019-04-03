package com.easyaccess.controller.user;

import com.easyaccess.model.user.User;
import com.easyaccess.service.user.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("token")
public class UserTokenController {

    @Autowired
    UserService userService;

    @PostMapping("newUser")
    public void create(@RequestBody User user) {
        userService.create(user);
    }

    @PostMapping("loginUser")
    public UserTokenController.Token login(@RequestBody User login) throws ServletException {

        String jwtToken = "";

        String email = login.getEmail();
        String password = login.getPassword();

        User user = userService.getByEmail(email);

        if (user == null) {
            throw new ServletException("User username not found.");
        }

        String pwd = user.getPassword();

        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }

        if (user.getRol() == "Company") {
            jwtToken = Jwts.builder().setSubject(email).claim("roles", "company").setIssuedAt(new Date()).
                    signWith(SignatureAlgorithm.HS256, "secretkey").compact();
        } else {
            jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date()).
                    signWith(SignatureAlgorithm.HS256, "secretkey").compact();
        }

        return new Token(jwtToken);
    }

    public class Token {
        String accessToken;

        public Token(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String access_token) {
            this.accessToken = access_token;
        }
    }
}
