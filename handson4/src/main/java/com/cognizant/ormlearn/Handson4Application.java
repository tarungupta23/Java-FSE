package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class Handson4Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Handson4Application.class);

	private static EmployeeService employeeService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Handson4Application.class, args);
		LOGGER.info("Inside main");

		employeeService = context.getBean(EmployeeService.class);

		testAddEmployee();
	}

	private static void testAddEmployee() {
		LOGGER.info("Start");

		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setDesignation("Software Engineer");
		employee.setSalary(55000.0);

		Employee savedEmployee = employeeService.addEmployee(employee);
		LOGGER.debug("savedEmployee={}", savedEmployee);

		LOGGER.info("End");
	}

}
