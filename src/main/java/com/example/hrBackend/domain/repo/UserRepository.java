package com.example.hrBackend.domain.repo;

import com.example.hrBackend.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {
}