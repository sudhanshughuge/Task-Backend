package com.task.TaskBackend.repository;

import com.task.TaskBackend.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
