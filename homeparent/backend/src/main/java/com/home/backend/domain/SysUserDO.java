package com.home.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * @author guxc
 * @date 2020/9/6
 */
@Data
@Builder
@Table(name = "sys_user")
@NoArgsConstructor
@AllArgsConstructor
public class SysUserDO extends BaseDO{

    private String username;

    private String password;

    private String displayName;

    /**
     * 是否离职
     * @see com.home.backend.enums.PresentStatusEnum
     */
    private Integer status;

    private String userMobile;

    private String userEmail;
}
