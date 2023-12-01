package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.data;
import com.test.demo.service.dataService;

@RequestMapping("/")
@RestController
public class controller {

    private final dataService dataServ;

    @Autowired
    public controller(dataService dataServ) {
        this.dataServ = dataServ;
    }

    @GetMapping
    public ResponseEntity<List<data>> getAllNumbers() {
        return ResponseEntity.ok(dataServ.getAllNumbers());
    }
}
