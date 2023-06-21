package com.example.personal.service.concretes;

import com.example.personal.controller.ExpenseDTO;
import com.example.personal.mapper.MapperExpense;
import com.example.personal.persistence.dao.ExpenseDAO;
import com.example.personal.persistence.repository.RepositoryExpenses;
import com.example.personal.service.contracts.ExpenseService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ExpenseServiceImpl implements ExpenseService {

    MapperExpense mapper = Mappers.getMapper( MapperExpense.class );

    @Autowired
    RepositoryExpenses repositoryExpenses;
    @Override
    public boolean saveExpense(ExpenseDTO expense) {
        ExpenseDAO expenseDAO = mapper.dtoToExpense(expense);
        ExpenseDAO expenseSaved = repositoryExpenses.save(expenseDAO);
        return expenseSaved.getId() != null;
    }

    @Override
    public ExpenseDTO getExpense(Integer id) {
        ExpenseDAO res = repositoryExpenses.getReferenceById(id);
        return mapper.expenseToDto(res);
    }

    @Override
    public boolean hideExpense(Integer id) {
        repositoryExpenses.deleteById(id);
        return true;
    }

    @Override
    public List<ExpenseDTO> ListExpenses() {
        List<ExpenseDAO> listResponse = repositoryExpenses.findAll();
        return listResponse.stream().map(x->mapper.expenseToDto(x)).collect(Collectors.toList());
    }


}
