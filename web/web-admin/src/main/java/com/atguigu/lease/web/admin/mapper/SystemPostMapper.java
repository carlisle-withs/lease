package com.atguigu.lease.web.admin.mapper;

import com.atguigu.lease.model.entity.SystemPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* @author liubo
* @description 针对表【system_post(岗位信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.atguigu.lease.model.SystemPost
*/
public interface SystemPostMapper extends BaseMapper<SystemPost> {

    IPage<SystemPost> pageItem(Page<SystemPost> page);
}




