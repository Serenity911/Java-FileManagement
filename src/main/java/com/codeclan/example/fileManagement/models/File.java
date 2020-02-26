package com.codeclan.example.fileManagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileId;

    @Column
    private String name;

    @Column
    private String extension;

    @Column
    private int kByteSize;

    @JsonIgnoreProperties("files")
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;


    public File() {
    }

    public File(String name, String extension, int kByteSize, Folder folder) {
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

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
