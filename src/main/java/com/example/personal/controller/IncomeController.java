package com.example.personal.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncomeController {

    @RequestMapping(value = "/incomesave", method = RequestMethod.GET)
    public ResponseEntity<IncomeDTO> saveIncome(@RequestBody IncomeDTO income) {
        return new ResponseEntity<IncomeDTO>(HttpStatus.CREATED);
    }
}
