package com.example.implementing_token_and_role_base_auth.service;

import com.example.implementing_token_and_role_base_auth.dao.RoleDao;
import com.example.implementing_token_and_role_base_auth.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
