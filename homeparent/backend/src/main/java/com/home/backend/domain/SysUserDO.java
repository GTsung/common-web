package com.home.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Table(name = "sys_user")
@NoArgsConstructor
@AllArgsConstructor
public class SysUserDO extends BaseDO{

    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
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
