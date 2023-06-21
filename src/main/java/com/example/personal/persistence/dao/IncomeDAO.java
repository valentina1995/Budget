package com.example.personal.persistence.dao;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "incomes")
@Data
public class IncomeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer id;
     String type;
     String description;
     String value;
     String imageid;
     Date date;

}