package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class BillableTask extends Task{
    private double hourlyRate;

}
