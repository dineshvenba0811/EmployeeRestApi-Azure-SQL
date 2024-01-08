package com.dinesh.org.employeeservice.repository;

import com.dinesh.org.employeeservice.dto.EmployeeDto;
import com.dinesh.org.employeeservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
