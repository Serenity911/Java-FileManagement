package com.codeclan.example.fileManagement.repositories;

import com.codeclan.example.fileManagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
