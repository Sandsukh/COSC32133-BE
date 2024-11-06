package com.example.CRUD_application.repository;
import com.example.CRUD_application.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepsitory extends JpaRepository<Employee,Long> {
    //crud
    List<Employee> findByFirstName(String firstName);

    //:firstName is a named parameter in the query
    @Query("SELECT e.email FROM Employee e WHERE e.firstName = :firstName")
    List<String> findEmailByFirstName(@Param("firstName") String firstName);
}