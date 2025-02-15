package com.atguigu.lease.web.admin.mapper;

import com.atguigu.lease.model.entity.AttrKey;
import com.atguigu.lease.web.admin.vo.attr.AttrKeyVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author liubo
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.atguigu.lease.model.AttrKey
*/
public interface AttrKeyMapper extends BaseMapper<AttrKey> {

    // 在AttrKeyMapper类中，设计一个listAttrInfo方法，用于返回一个AttrKeyVo类对象的列表；
    // 问题在于：参数key在哪里获取？
    // 回答：不需要参数key，调用该方法后，直接获取到所有的属性名，以及对应的属性值
    List<AttrKeyVo> listAttrInfo();
}




