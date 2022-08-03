package com.nau.dto;

import java.util.Objects;

public class EmployeeDTO {
	private int id;
	private String fullName;
	private String city;

	public EmployeeDTO() {
		this(0, null, null);
	}

	public EmployeeDTO(int id, String fullName, String city) {
		this.id = id;
		this.fullName = fullName;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", fullName=" + fullName + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return id == other.id;
	}

}
