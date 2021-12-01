package com.wallace.todoapp.repos;

import com.wallace.todoapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

    User findFirstUserByUsername(String username);

    User findFirstUserByPassword(String password);

}
