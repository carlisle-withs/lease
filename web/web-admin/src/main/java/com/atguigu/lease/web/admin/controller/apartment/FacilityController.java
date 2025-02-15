package com.atguigu.lease.web.admin.controller.apartment;


import com.atguigu.lease.common.result.Result;
import com.atguigu.lease.model.entity.FacilityInfo;
import com.atguigu.lease.model.enums.ItemType;
import com.atguigu.lease.web.admin.service.FacilityInfoService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "配套管理")
@RestController
@RequestMapping("/admin/facility")
public class FacilityController {

    @Autowired
    private FacilityInfoService service;

    @Operation(summary = "[根据类型]查询配套信息列表")
    @GetMapping("list")
    // 返回值是个列表，即公寓/房间的配套信息列表；存在请求参数ItemType，使用@RequestParam注解，且该参数是非必须的，如果不携带参数，则返回所有的配套信息
    public Result<List<FacilityInfo>> listFacility(@RequestParam(required = false) ItemType type) {
        // 建立一个lambda的条件构造器，需要指定泛型的类型
        LambdaQueryWrapper<FacilityInfo> queryWrapper = new LambdaQueryWrapper<>();
        // 判断type是否为null，如果不为空，则条件构造器中添加对比条件 FacilityInfo::getType == type
        queryWrapper.eq(type != null, FacilityInfo::getType, type);
        // 使用service类本身具有的list方法，从而获得需要的FacilityInfo对象的列表
        List<FacilityInfo> list = service.list(queryWrapper);
        return Result.ok(list);
    }

    @Operation(summary = "新增或修改配套信息")
    @PostMapping("saveOrUpdate")
    // 返回值是一个Result结果类；存在请求体FacilityInfo，使用@RequestBody注解，将复杂的json转换成java对象
    public Result saveOrUpdate(@RequestBody FacilityInfo facilityInfo) {
        service.saveOrUpdate(facilityInfo);
        return Result.ok();
    }

    @Operation(summary = "根据id删除配套信息")
    @DeleteMapping("deleteById")
    // 返回值是一个Result结果类；请求参数是一个简单值id，通过@DeleteMapping注解
    public Result removeFacilityById(@RequestParam Long id) {
        service.removeById(id);
        return Result.ok();
    }

}
