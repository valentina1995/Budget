package com.example.personal.model.dao;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "incomes")
public class IncomeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String description;
    private String value;
    private String imageid;
    private Date date;

}