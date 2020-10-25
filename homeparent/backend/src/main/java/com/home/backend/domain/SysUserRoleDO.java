package com.home.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * @author GTsung
 * @date 2020/10/25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sys_user_role")
public class SysUserRoleDO {

    private Long id;

    private String userId;

    private String roleId;
}
