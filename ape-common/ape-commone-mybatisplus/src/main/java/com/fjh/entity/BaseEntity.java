package com.fjh.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
public class BaseEntity {
    @TableField(fill = FieldFill.INSERT )
    private String createBy;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    @TableField(fill = FieldFill.INSERT)

    private Integer deleteFlag;
    @TableField(fill = FieldFill.INSERT)

    private Integer version;

}
