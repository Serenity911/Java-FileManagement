package com.codeclan.example.fileManagement.repositories;

import com.codeclan.example.fileManagement.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
