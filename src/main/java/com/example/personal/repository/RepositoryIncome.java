package com.example.personal.repository;


import com.example.personal.model.dao.IncomeDAO;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RepositoryIncome extends JpaRepository<IncomeDAO, Integer> {
}
