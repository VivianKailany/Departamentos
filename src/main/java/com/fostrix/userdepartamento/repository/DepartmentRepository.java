package com.fostrix.userdepartamento.repository;


import com.fostrix.userdepartamento.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
