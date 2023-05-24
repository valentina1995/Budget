package com.example.personal.repository;


import com.example.personal.model.dao.ExpenseDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExpenses extends JpaRepository<ExpenseDAO, Integer> {
}
