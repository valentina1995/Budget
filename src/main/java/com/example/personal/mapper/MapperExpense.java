package com.example.personal.mapper;

import com.example.personal.controller.ExpenseDTO;
import com.example.personal.controller.IncomeDTO;
import com.example.personal.persistence.dao.ExpenseDAO;
import com.example.personal.persistence.dao.IncomeDAO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MapperExpense {
    MapperExpense MAPPER = Mappers.getMapper( MapperExpense.class );

    @Mapping(source = "id", target = "id")
    ExpenseDTO expenseToDto(ExpenseDAO expense);

    @Mapping(source = "id", target = "id")
    ExpenseDAO dtoToExpense(ExpenseDTO expenseDTO);

    @Mapping(source = "id", target = "id")
    IncomeDTO incomeToDto(IncomeDAO expense);

    @Mapping(source = "id", target = "id")
    IncomeDAO dtoToIncome(IncomeDTO expenseDTO);
}
