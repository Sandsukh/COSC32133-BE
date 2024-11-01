package com.example.CRUD_application.repository;
import com.example.CRUD_application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepsitory extends JpaRepository<Employee,Long> {
    //crud
}