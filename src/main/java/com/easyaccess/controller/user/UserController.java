package com.easyaccess.controller.user;

import com.easyaccess.model.user.User;
import com.easyaccess.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public User getByEmail(@PathVariable("email") String email) {
        return userService.getByEmail(email);
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
