package com.test.repository;

import com.test.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User , Long > {

    User findUserByUsernameAndPassword(String username,String password);

}
