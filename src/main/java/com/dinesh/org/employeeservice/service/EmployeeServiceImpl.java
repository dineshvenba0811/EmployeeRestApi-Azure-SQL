package com.dinesh.org.employeeservice.service;

import com.dinesh.org.employeeservice.dto.APIResponseDto;
import com.dinesh.org.employeeservice.dto.EmployeeDto;
import com.dinesh.org.employeeservice.dto.DepartmentDto;
import com.dinesh.org.employeeservice.entity.EmployeeEntity;
import com.dinesh.org.employeeservice.mapper.EmployeeMapper;
import com.dinesh.org.employeeservice.repository.EmployeeRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity =EmployeeMapper.mapToEntity(employeeDto);
        EmployeeEntity savedEmployeeEntity=employeeRepository.save(employeeEntity);
        return EmployeeMapper.mapToDto(savedEmployeeEntity);
    }


    //@CircuitBreaker(name="${spring.application.name}",fallbackMethod = "getDefaultDepartment")
    @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Override
    public EmployeeDto getEmployee(Long employeeId) {
        EmployeeEntity employeeEntity =employeeRepository.findById(employeeId).get();
        return EmployeeMapper.mapToDto(employeeEntity);
    }

}
