package com.nau.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nau.dto.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static Map<Integer, EmployeeDTO> employeesTable= new HashMap<>();
	static{
		employeesTable.put(1, new EmployeeDTO(1, "NAUSHAD", "MUMBAI"));
		employeesTable.put(2, new EmployeeDTO(2, "AKHTAR", "PUNE"));
		employeesTable.put(3, new EmployeeDTO(3, "PARUL", "GOA"));
	}

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
		int id= employeeDTO.getId();
		return employeesTable.putIfAbsent(id, employeeDTO) ;
	}

	@Override
	public EmployeeDTO getEmployee(int id) {
		EmployeeDTO dto = employeesTable.get(id);
		return dto;
	}

	@Override
	public List<EmployeeDTO> getEmployees() {
		return null;
	}

}
