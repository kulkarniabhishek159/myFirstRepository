package com.example.sbpostgresql.myFirstPostgresqlSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbpostgresql.myFirstPostgresqlSpring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
