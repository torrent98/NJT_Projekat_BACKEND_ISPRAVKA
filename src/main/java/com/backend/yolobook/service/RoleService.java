package com.backend.yolobook.service;

import com.backend.yolobook.dao.RoleDao;
import com.backend.yolobook.entity.Role;
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
