package com.project.Employee_InfoHub.Repository;

import com.project.Employee_InfoHub.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}