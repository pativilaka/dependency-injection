package com.vilaka.dependencyinjectionspring.services;

import com.vilaka.dependencyinjectionspring.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private PensionService pensionService;
    @Autowired
    private TaxService taxService;

    public double netSalary(Employee employee){
        return employee.getGrossSalary() - pensionService.discount(employee.getGrossSalary())
                - taxService.tax(employee.getGrossSalary());
    }
}
