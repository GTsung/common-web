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
@Table(name = "sys_role_perm")
public class SysRolePermDO {

    private Long id;

    private String roleId;

    private String permId;
}
