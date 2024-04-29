package com.vilaka;

import com.vilaka.entities.Employee;
import com.vilaka.services.SalaryService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class app {

    @Inject
    private SalaryService salaryService;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double calc() {
        Employee employee = new Employee("Maria", 4000);
        return salaryService.netSalary(employee);
    }
}
