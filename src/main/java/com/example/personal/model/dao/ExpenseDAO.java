package com.example.personal.model.dao;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "expenses")
@Data
public class ExpenseDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer id;
     String type;
     String description;
     String value;
     String imageid;
     Date date;
}
