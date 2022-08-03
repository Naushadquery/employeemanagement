package com.nau.service;

import com.nau.dao.EmployeeDAO;
import com.nau.dao.EmployeeDAOImpl;
import com.nau.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@Override
	public boolean addEmployee(EmployeeDTO employeeDTO) {
		employeeDTO.setFullName(employeeDTO.getFullName().toUpperCase());
		employeeDTO.setCity(employeeDTO.getCity().toUpperCase());
		EmployeeDTO dto = employeeDAO.addEmployee(employeeDTO);
		if(dto==null) {
			return true;
		}else {
			return false;
		}
	}

}
