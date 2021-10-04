package com.fanalca.employe.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.fanalca.employe.models.EmployeModel;
import com.fanalca.employe.services.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@Api("This is The Hello Swagger API Documentation")
@RequestMapping("/employe")
public class EmployeController {
    @Autowired
    EmployeService employeService;

    @GetMapping()
    @ApiOperation("Return list of all employees")
    public ArrayList<EmployeModel> getEmployees() {
        return employeService.getAllEmployes();
    }
    
    @PostMapping()
    @ApiOperation("method POST request, by create employee")
    public EmployeModel createEmploye(@RequestBody EmployeModel employe) {
        return this.employeService.saveEmploye(employe);
    }

    @GetMapping(path = "/{id}")
    public Optional <EmployeModel> getEmployebyId(@PathVariable("id") Long id) {
        return this.employeService.getEmployeById(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<EmployeModel> getEmployebyName(@RequestParam("nombres") String nombres) {
        return this.employeService.getEmployeByName(nombres);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteEmploye(@PathVariable("id") Long id) {
        boolean deleted = this.employeService.deleteEmploye(id);
        if (deleted) {
            return "Se elimino el Empleado con el nui " + id;
        } else {
            return "No se pudo eliminar el empleado con el nui " + id;
        }
    }
}
