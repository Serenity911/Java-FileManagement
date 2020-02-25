package com.codeclan.example.fileManagement.repositories;

import com.codeclan.example.fileManagement.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
