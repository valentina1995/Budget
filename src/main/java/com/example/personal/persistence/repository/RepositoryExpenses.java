package com.example.personal.persistence.repository;


import com.example.personal.persistence.dao.ExpenseDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExpenses extends JpaRepository<ExpenseDAO, Integer> {
}
