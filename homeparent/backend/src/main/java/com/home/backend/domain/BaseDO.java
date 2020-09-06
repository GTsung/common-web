package com.home.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

/**
 * @author guxc
 * @date 2020/9/6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDO {

    @Id
    private Long id;

    /**
     * @see com.home.backend.enums.DelFlagEnum
     */
    private Integer delFlag;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;
}
