package com.atguigu.lease.web.admin.service.impl;

import com.atguigu.lease.model.entity.SystemPost;
import com.atguigu.lease.model.entity.SystemUser;
import com.atguigu.lease.web.admin.mapper.SystemPostMapper;
import com.atguigu.lease.web.admin.mapper.SystemUserMapper;
import com.atguigu.lease.web.admin.service.SystemUserService;
import com.atguigu.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.atguigu.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 * @createDate 2023-07-24 15:48:00
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

    @Autowired
    private SystemUserMapper userMapper;

    @Autowired
    private SystemPostMapper postMapper;

    @Override
    public IPage<SystemUserItemVo> pageItem(Page<SystemUserItemVo> page, SystemUserQueryVo queryVo) {
        return userMapper.pageItem(page, queryVo);
    }

    @Override
    public SystemUserItemVo getSystemUserItemById(Long id) {
        SystemUser systemUser = userMapper.selectById(id);
        SystemPost systemPost = postMapper.selectById(systemUser.getPostId());
        SystemUserItemVo res = new SystemUserItemVo();
        BeanUtils.copyProperties(systemUser, res);
        res.setPostName(systemPost.getName());
        return res;
    }
}




