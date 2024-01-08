package com.dinesh.org.employeeservice.service;

import com.dinesh.org.employeeservice.dto.DepartmentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080",value = "DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("api/departments/{getDepartmentCode}")
    DepartmentDto getDepartment(@PathVariable("getDepartmentCode") String departmentName);
}
