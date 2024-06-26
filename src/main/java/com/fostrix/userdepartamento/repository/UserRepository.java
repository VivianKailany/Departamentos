package com.fostrix.userdepartamento.repository;

import com.fostrix.userdepartamento.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
