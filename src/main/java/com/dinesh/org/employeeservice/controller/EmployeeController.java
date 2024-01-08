package com.dinesh.org.employeeservice.controller;

import com.dinesh.org.employeeservice.dto.APIResponseDto;
import com.dinesh.org.employeeservice.dto.EmployeeDto;
import com.dinesh.org.employeeservice.service.EmployeeService;
import com.dinesh.org.employeeservice.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/employees/")
public class EmployeeController {

    private EmployeeService employeeService;



    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee= employeeService.saveEmployee(employeeDto);
        return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeByID(@PathVariable ("employeeId") Long employeeId){
        EmployeeDto employeeDto=employeeService.getEmployee(employeeId);
        return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }
}
