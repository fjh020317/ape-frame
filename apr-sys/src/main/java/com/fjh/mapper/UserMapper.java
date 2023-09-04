package com.fjh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fjh.entity.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper extends BaseMapper<UserPo> {
}
