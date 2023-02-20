package com.example.implementing_token_and_role_base_auth.dao;

import com.example.implementing_token_and_role_base_auth.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
