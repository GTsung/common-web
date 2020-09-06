package com.home.backend.service.impl;

import com.home.backend.domain.SysUserDO;
import com.home.backend.manager.UserManager;
import com.home.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guxc
 * @date 2020/9/6
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    @Override
    public int save(SysUserDO userDO) {
        return userManager.save(userDO);
    }

    @Override
    public List<SysUserDO> getAll() {
        return userManager.getAll();
    }
}
