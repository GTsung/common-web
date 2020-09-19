package com.home.backend.service.impl;

import com.home.backend.domain.SysUserDO;
import com.home.backend.manager.UserManager;
import com.home.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    @Override
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public int save(SysUserDO userDO) {
         return userManager.save(userDO);
    }

    @Override
    public List<SysUserDO> getAll() {
        return userManager.getAll();
    }
}
