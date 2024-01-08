package com.dinesh.org.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class DepartmentDto {
    private Long id;
    private  String departmentName;
    private  String departmentCode;
    private  String departmentDescription;
}
