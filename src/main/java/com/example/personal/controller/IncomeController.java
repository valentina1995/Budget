package com.example.personal.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("incomes")
public class IncomeController {

    @RequestMapping(value = "/saveincome", method = RequestMethod.POST)
    public ResponseEntity<IncomeDTO> saveIncome(@RequestBody IncomeDTO income) {
        return new ResponseEntity<IncomeDTO>(HttpStatus.CREATED);
    }
    @RequestMapping(value = "/getincome/{id}", method = RequestMethod.GET)
    public ResponseEntity<IncomeDTO> getIncome(@RequestBody IncomeDTO income) {
        return new ResponseEntity<IncomeDTO>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/hideIncome/{id}", method = RequestMethod.POST)
    public ResponseEntity<IncomeDTO> hideIncome(@PathVariable Integer id) {
        return new ResponseEntity<IncomeDTO>(HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = "/listincomes", method = RequestMethod.GET)
    public ResponseEntity<List<IncomeDTO>> ListIncomes() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/updateincome/{id}", method = RequestMethod.POST)
    public ResponseEntity<IncomeDTO> updateIncome(@PathVariable Integer id, @RequestBody IncomeDTO income) {
        return new ResponseEntity<IncomeDTO>(HttpStatus.CREATED);
    }
}
