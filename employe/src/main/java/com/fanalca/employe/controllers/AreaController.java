package com.fanalca.employe.controllers;

import java.util.ArrayList;

import com.fanalca.employe.models.AreaModel;
import com.fanalca.employe.services.AreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Api("This is The Area Swagger API Documentation")
@RequestMapping("/area")
public class AreaController {
    @Autowired
    AreaService areaService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping()
    @ApiOperation("Return list of all areas")
    public ArrayList<AreaModel> getAreas() {
        return areaService.getAllAreas();
    }
}
