package com.example.personal.service.contracts;

import com.example.personal.controller.IncomeDTO;
import org.springframework.stereotype.Service;

@Service
public interface IncomeService {

    boolean saveIncome( IncomeDTO income);

}
