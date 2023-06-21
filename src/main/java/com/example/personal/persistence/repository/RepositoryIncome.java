package com.example.personal.persistence.repository;


import com.example.personal.persistence.dao.IncomeDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryIncome extends JpaRepository<IncomeDAO, Integer> {
}
