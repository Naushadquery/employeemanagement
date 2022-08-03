package com.nau.controller;

import com.nau.dto.EmployeeDTO;
import com.nau.service.EmployeeService;
import com.nau.service.EmployeeServiceImpl;

public class EmployeeController {
	
	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	public String addEmployee(EmployeeDTO employeeDTO) {
		boolean result = employeeService.addEmployee(employeeDTO);
		if(result) {
			return "Employee Saved Successfully";
		}else {
			return "Employee ID Already Exist";
		}
	}

}
