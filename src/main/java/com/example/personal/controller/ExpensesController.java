package com.example.personal.controller;

import com.example.personal.service.contracts.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/expenses")
public class ExpensesController {

    @Autowired
    ExpenseService expenseService ;



    @RequestMapping(value = "/saveexpenses", method = RequestMethod.POST)
    public ResponseEntity<ExpenseDTO> saveIncome(@RequestBody ExpenseDTO income) {
       boolean response = expenseService.saveExpense(income);
       if(response){
           return new ResponseEntity<>(HttpStatus.CREATED);
       }else{
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }

    }
    @RequestMapping(value = "/getexpenses/{id}", method = RequestMethod.GET)
    public ResponseEntity<ExpenseDTO> getexpense(@RequestBody Integer id) {
        ExpenseDTO list = expenseService.getExpense(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/hideexpense/{id}", method = RequestMethod.POST)
    public ResponseEntity<ExpenseDTO> deleteExpense(@PathVariable Integer id) {
        boolean response = expenseService.hideExpense(id);
        if(response){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/listexpenses", method = RequestMethod.GET)
    public ResponseEntity<List<ExpenseDTO>> Listexpenses() {
        List<ExpenseDTO> list = expenseService.ListExpenses();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
