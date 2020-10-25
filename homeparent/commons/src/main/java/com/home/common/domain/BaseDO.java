package com.home.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDO {

    @Id
    private Long id;

    /**
     * @see com.home.common.enums.DelFlagEnum
     */
    private Integer delFlag;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;
}
