package com.dinesh.org.employeeservice.mapper;

import com.dinesh.org.employeeservice.dto.EmployeeDto;
import com.dinesh.org.employeeservice.entity.EmployeeEntity;

public class EmployeeMapper {

    public static EmployeeDto mapToDto(EmployeeEntity employeeEntity){
        return new EmployeeDto(
                employeeEntity.getId(),
                employeeEntity.getFirstName(),
                employeeEntity.getLastName(),
                employeeEntity.getEmail(),
                employeeEntity.getDepartmentCode()
        );
    }

    public static EmployeeEntity mapToEntity(EmployeeDto employeeDto){
        return new EmployeeEntity(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode()

        );
    }
}
