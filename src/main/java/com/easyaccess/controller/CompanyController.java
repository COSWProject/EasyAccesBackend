package com.easyaccess.controller;

import com.easyaccess.model.Company;
import com.easyaccess.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("new")
    public void create(@RequestBody Company company) {
        companyService.create(company);
    }

    @GetMapping("id/{id}")
    @ResponseBody
    public Company getById(@PathVariable("id") String id) {
        return companyService.getById(id);
    }

    @GetMapping("all")
    @ResponseBody
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") String id) {
        companyService.deleteById(id);
    }

    @GetMapping("nit/{nit}")
    public Company getByNit(@PathVariable("nit") Long nit) {
        return companyService.getByNit(nit);
    }
}
