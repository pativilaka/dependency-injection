import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        Employee employee = new Employee(name, grossSalary);

        PensionService pensionService = new PensionService();
        TaxService taxService = new TaxService();

        SalaryService salaryService = new SalaryService(pensionService, taxService);

        double netSalary = salaryService.netSalary(employee);

        System.out.printf("Net salary $%.2f%n", netSalary);

        sc.close();
    }
}