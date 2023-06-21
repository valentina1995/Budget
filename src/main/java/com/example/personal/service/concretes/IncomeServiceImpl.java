package com.example.personal.service.concretes;

import com.example.personal.controller.IncomeDTO;
import com.example.personal.mapper.MapperExpense;
import com.example.personal.persistence.dao.IncomeDAO;
import com.example.personal.persistence.repository.RepositoryIncome;
import com.example.personal.service.contracts.IncomeService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

public class IncomeServiceImpl implements IncomeService {

    MapperExpense mapper = Mappers.getMapper( MapperExpense.class );

    @Autowired
    RepositoryIncome repositoryIncome;


    @Override
    public boolean saveIncome(IncomeDTO income) {
        IncomeDAO incomeDAO = mapper.dtoToIncome(income);

        IncomeDAO outIncome = repositoryIncome.save(incomeDAO);
        return outIncome.getId() != null;
    }
}
