package com.vilaka.services;

import com.vilaka.entities.Employee;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SalaryService {

    @Inject
    private TaxService taxService;
    @Inject
    private PensionService pensionService;

    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());
        }
}
