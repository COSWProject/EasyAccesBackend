package com.easyaccess.controller;

import com.easyaccess.model.Company;
import com.easyaccess.service.CompanyService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("token")
public class TokenController {

    @Autowired
    CompanyService companyService;

    @PostMapping("new")
    public void create(@RequestBody Company company) {
        companyService.create(company);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Token login(@RequestBody Company login)
            throws ServletException {

        String jwtToken = "";

        if (login.getEmail() == null || login.getPassword() == null) {
            throw new ServletException("Please fill in username and password");
        }

        String email = login.getEmail();
        String password = login.getPassword();

        Company company = companyService.getByEmail(email);

        if (company == null) {
            throw new ServletException("User username not found.");
        }

        String pwd = company.getPassword();

        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }
        //
        jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date()).signWith(
                SignatureAlgorithm.HS256, "secretkey").compact();

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
