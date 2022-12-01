package com.example.demo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //same as Component, just a semantics thing for readability
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
