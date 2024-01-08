package com.dinesh.org.employeeservice.service;

import com.dinesh.org.employeeservice.dto.APIResponseDto;
import com.dinesh.org.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployee(Long employeeId);
}
