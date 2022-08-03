package com.nau.ui;

import com.nau.controller.EmployeeController;
import com.nau.dto.EmployeeDTO;
import com.nau.service.EmployeeService;
import com.nau.service.EmployeeServiceImpl;

public class EmployeeView {
	
	public static void main(String[] args) {
		
		EmployeeDTO dto = new EmployeeDTO(1, "nau", "pune");
		EmployeeController controller = new EmployeeController();
		String message = controller.addEmployee(dto);
		System.out.println(message);
		
	}

}
