package com.vilaka.dependencyinjectionspring.entities;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private double grossSalary;

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }
}
