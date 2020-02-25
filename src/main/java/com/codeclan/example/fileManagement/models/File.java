package com.codeclan.example.fileManagement.models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fileId;

    @Column
    String name;

    @Column
    String extension;

    @Column
    int kByteSize;

    @Column
    String folder;

    public File(String name, String extension, int kByteSize, String folder) {
        this.name = name;
        this.extension = extension;
        this.kByteSize = kByteSize;
        this.folder = folder;
    }

    public Long getId() {
        return fileId;
    }

    public void setId(Long id) {
        this.fileId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getkByteSize() {
        return kByteSize;
    }

    public void setkByteSize(int kByteSize) {
        this.kByteSize = kByteSize;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}
