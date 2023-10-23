package com.task.TaskBackend.services;

import com.task.TaskBackend.entities.User;
import com.task.TaskBackend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public int getMaxUserId() {
        return 0;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(int UserID) {
        return null;
    }

    @Override
    public User getUserByUsername(String Username) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void updateUser(User user, int UserID) {

    }

    @Override
    public void deleteUser(int UserID) {

    }
}
