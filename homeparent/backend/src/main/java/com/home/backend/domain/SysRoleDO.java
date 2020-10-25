package com.home.backend.domain;

import com.home.common.domain.BaseDO;
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
@Table(name = "sys_role")
public class SysRoleDO extends BaseDO {

    private String roleName;

    private String roleDesc;

    /**
     * UUID
     */
    private String roleId;
}
