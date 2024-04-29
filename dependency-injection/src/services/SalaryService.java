package services;

import entities.Employee;

public class SalaryService {

    private PensionService pensionService;
    private TaxService taxService;

    public SalaryService(PensionService pensionService, TaxService taxService) {
        this.pensionService = pensionService;
        this.taxService = taxService;
    }

    public double netSalary(Employee employee){
        return employee.getGrossSalary() - pensionService.discount(employee.getGrossSalary())
                - taxService.tax(employee.getGrossSalary());
    }
}
