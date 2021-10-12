package com.fanalca.employe.controllers;

import java.util.ArrayList;

import com.fanalca.employe.models.TypenuiModel;
import com.fanalca.employe.services.TypenuiService;

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
@Api("This is The Type Nui Swagger API Documentation")
@RequestMapping("/typenui")
public class TypenuiController {
    @Autowired
    TypenuiService typenuiService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping()
    @ApiOperation("Return list of all types nui")
    public ArrayList<TypenuiModel> getTypenuis() {
        return typenuiService.getAllTypenuis();
    }
}
