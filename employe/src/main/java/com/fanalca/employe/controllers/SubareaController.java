package com.fanalca.employe.controllers;

import java.util.ArrayList;

import com.fanalca.employe.models.SubareaModel;
import com.fanalca.employe.services.SubareaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Api("This is The Sub Area Swagger API Documentation")
@RequestMapping("/subarea")
public class SubareaController {
    @Autowired
    SubareaService subareaService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(path = "/area/{id}")
    @ApiOperation("Return list of all areas")
    public ArrayList<SubareaModel> getAllSubareaByArea(@PathVariable("id") Long id) {
        //return subareaService.getAllSubareas();
        return subareaService.getAllSubareasbyArea(id);
    }
}
