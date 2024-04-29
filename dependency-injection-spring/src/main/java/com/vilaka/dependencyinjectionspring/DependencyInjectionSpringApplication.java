package com.vilaka.dependencyinjectionspring;

import com.vilaka.dependencyinjectionspring.entities.Employee;
import com.vilaka.dependencyinjectionspring.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DependencyInjectionSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSpringApplication.class, args);
	}

	@Autowired
	private SalaryService salaryService;

	//CommandLineRunner > Interface Spring to run the code in console.
	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		Employee employee = new Employee(name, grossSalary);

		double netSalary = salaryService.netSalary(employee);
		System.out.printf("Net salary $%.2f%n", netSalary);

		sc.close();

	}
}
