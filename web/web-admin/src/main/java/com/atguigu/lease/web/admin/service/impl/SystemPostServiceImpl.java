package com.atguigu.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.lease.model.entity.SystemPost;
import com.atguigu.lease.web.admin.service.SystemPostService;
import com.atguigu.lease.web.admin.mapper.SystemPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【system_post(岗位信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class SystemPostServiceImpl extends ServiceImpl<SystemPostMapper, SystemPost>
    implements SystemPostService{

    @Autowired
    private SystemPostMapper systemPostMapper;

    @Override
    public IPage<SystemPost> pageItem(Page<SystemPost> page) {
        return systemPostMapper.pageItem(page);
    }
}




