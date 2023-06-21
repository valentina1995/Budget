package com.example.personal.service.contracts;

import com.example.personal.controller.ExpenseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    boolean saveExpense( ExpenseDTO income);
    ExpenseDTO getExpense( Integer id);
    boolean hideExpense( Integer id);
    List<ExpenseDTO> ListExpenses();
}
