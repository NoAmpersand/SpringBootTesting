package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class EmployeeService {
    public List<Employee> getEmployees(){
        return List.of(
                new Employee(1L,
                        "NoAmp",
                        "no.ampersand@gmail.com",
                        LocalDate.of(1979, Month.FEBRUARY, 12),
                        41
                )
        );
    }
}
