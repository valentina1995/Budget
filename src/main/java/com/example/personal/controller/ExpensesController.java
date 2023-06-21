package com.example.personal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/expenses")
public class ExpensesController {
    @RequestMapping(value = "/saveexpenses", method = RequestMethod.POST)
    public ResponseEntity<ExpenseDTO> saveIncome(@RequestBody ExpenseDTO income) {
        return new ResponseEntity<ExpenseDTO>(HttpStatus.CREATED);
    }
    @RequestMapping(value = "/getexpenses/{id}", method = RequestMethod.GET)
    public ResponseEntity<ExpenseDTO> getexpense(@RequestBody ExpenseDTO expense) {
        return new ResponseEntity<ExpenseDTO>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/hideexpense/{id}", method = RequestMethod.POST)
    public ResponseEntity<ExpenseDTO> hideexpense(@PathVariable Integer id) {
        return new ResponseEntity<ExpenseDTO>(HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = "/listexpenses", method = RequestMethod.GET)
    public ResponseEntity<List<ExpenseDTO>> Listexpenses() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/updateexpense/{id}", method = RequestMethod.POST)
    public ResponseEntity<ExpenseDTO> updateExpense(@PathVariable Integer id, @RequestBody ExpenseDTO expense) {
        return new ResponseEntity<ExpenseDTO>(HttpStatus.CREATED);
    }
}
