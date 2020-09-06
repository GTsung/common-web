package com.home.backend.service;

import com.home.backend.domain.SysUserDO;

import java.util.List;

public interface UserService {

    int save(SysUserDO userDO);

    List<SysUserDO> getAll();
}
