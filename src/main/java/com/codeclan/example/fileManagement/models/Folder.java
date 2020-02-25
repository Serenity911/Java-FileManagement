package com.codeclan.example.fileManagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long folderId;

    @Column
    private String title;

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;

    @JsonIgnoreProperties(value = "users")
    @ManyToMany
    @JoinTable(
            name = "user_folder",
            joinColumns = {@JoinColumn(
                    name = "user_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "folder_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<User> users;

    public Folder() {
    }

    public Folder(String title) {
        this.title = title;
        this.files = new ArrayList<>();
        this.users = new ArrayList<User>();
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User userTobeAdded){
        this.users.add(userTobeAdded);
    }
}
