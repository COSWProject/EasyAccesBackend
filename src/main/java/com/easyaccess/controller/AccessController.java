package com.easyaccess.controller;


import com.easyaccess.model.Access;
import com.easyaccess.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/access")
public class AccessController {
    @Autowired
    AccessService accessService;

    @GetMapping("id/{id}")
    @ResponseBody
    public Access getById(@PathVariable("id") String id) {
        return accessService.getById(id);
    }

    @GetMapping("owner/{owner}")
    @ResponseBody
    public Access getByOwner(@PathVariable("owner") String owner) {
        return accessService.getByOwner(owner);
    }

    @GetMapping("all")
    @ResponseBody
    public List<Access> getAll() { return accessService.getAll(); }

    @PostMapping
    public void creteAccess(@RequestBody Access access) { accessService.create(access); }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") String id) {
        accessService.deleteById(id);
    }

}
