package com.nau.dao;

import java.util.List;

import com.nau.dto.EmployeeDTO;

public interface EmployeeDAO {
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
	public EmployeeDTO getEmployee(int id);
	public List<EmployeeDTO> getEmployees();
}
