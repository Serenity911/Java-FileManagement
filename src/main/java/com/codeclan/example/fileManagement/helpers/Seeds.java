package com.codeclan.example.fileManagement.helpers;

import com.codeclan.example.fileManagement.models.File;
import com.codeclan.example.fileManagement.models.Folder;
import com.codeclan.example.fileManagement.models.User;
import com.codeclan.example.fileManagement.repositories.FileRepository;
import com.codeclan.example.fileManagement.repositories.FolderRepository;
import com.codeclan.example.fileManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class Seeds implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public Seeds() {
    }

    public void run(ApplicationArguments args) throws Exception {
        Folder secrets = new Folder ("Secret");
        folderRepository.save(secrets);
        Folder todos = new Folder("Todos");
        folderRepository.save(todos);

        File file1 = new File ("Todo", "txt", 12, todos);
        fileRepository.save(file1);
        File file2 = new File ("The secret Recipe", "pdf", 10, secrets);
        fileRepository.save(file2);

        User user1 = new User("Bob");
        userRepository.save(user1);

        User user2 = new User ("Jim");
        userRepository.save(user2);

        user1.addFolder(todos);
        user2.addFolder(secrets);
        userRepository.save(user1);
        userRepository.save(user2);
        todos.addUser(user2);
        userRepository.save(user2);



    }
}
