package com.example.hrBackend.domain.repo;

import com.example.hrBackend.domain.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}