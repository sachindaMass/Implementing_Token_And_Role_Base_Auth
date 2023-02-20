package com.example.implementing_token_and_role_base_auth.dao;

import com.example.implementing_token_and_role_base_auth.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
