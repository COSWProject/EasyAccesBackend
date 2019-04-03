package com.easyaccess.controller.user;

import com.easyaccess.model.user.User;
import com.easyaccess.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("id/{id}")
    @ResponseBody
    public User getById(@PathVariable("id") String id) {
        return userService.getById(id);
    }

    @GetMapping("email/{email}")
    @ResponseBody
    public User getByEmail(@PathVariable("email") String email) { return userService.getByEmail(email); }

    @GetMapping("userbyemail/{email}")
    @ResponseBody
    public String getUserByEmail (@PathVariable("email") String email) {
        System.out.println("ENTRA");
        List<String> user = new ArrayList<>();
        User u = userService.getByEmail(email);
        user.add(u.getName());
        user.add(u.getPassword());
        user.add(u.getId());
        user.add(u.getEmail());
        user.add(String.valueOf(u.getMobilePhone()));
        user.add(u.getAddress());
        user.add(String.valueOf(u.getHomePhone()));
        user.add(u.getOccupation());
        user.add(u.getOrganization());
        user.add(u.getCity());
        user.add(u.getState());
        user.add(u.getCountry());
        user.add(String.valueOf(u.getPostalCode()));
        return u.getName();

    }

    @GetMapping("all")
    @ResponseBody
    public List<User> getAll() {
        return userService.getAll();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") String id) {
        userService.deleteById(id);
    }

    @GetMapping("cardId/{cardId}")
    public User getByCardId(@PathVariable("cardId") int cardId) {
        return userService.getByCardId(cardId);
    }
}
