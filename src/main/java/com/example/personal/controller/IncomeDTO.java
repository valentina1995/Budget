package com.example.personal.controller;


import lombok.Data;

import java.util.Date;
@Data
public class IncomeDTO {
     Integer id;
     String type;
     String description;
     String value;
     String imageid;
     Date date;
}
