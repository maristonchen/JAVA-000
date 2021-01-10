package com.mariston.week07.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mariston.week07.anno.ReadOnly;
import com.mariston.week07.base.Result;
import com.mariston.week07.entity.dto.CustomerDto;
import com.mariston.week07.entity.qo.CustomerQo;
import com.mariston.week07.entity.vo.CustomerVo;
import com.mariston.week07.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * 客户信息表(Customer)表控制层
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:01:33
 */
@RestController
@RequestMapping("/customer")
@Api(tags = "客户信息")
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;

    /**
     * 分页查询所有数据
     *
     * @param qo 查询实体
     * @return 所有数据
     */
    @GetMapping("queryByPage")
    @ApiOperation(value = "客户信息分页查询", notes = "客户信息分页查询")
    public Result<Page<CustomerVo>> queryByPage(CustomerQo qo) {
        return Result.succ(this.customerService.queryByPage(qo));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ReadOnly
    @GetMapping("queryById")
    @ApiOperation(value = "客户信息通过主键查询单条数据", notes = "客户信息通过主键查询单条数据")
    public Result<CustomerVo> queryById(@RequestParam("id") Serializable id) {
        return Result.succ(this.customerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param dto 传输对象
     * @return 新增结果
     */
    @PostMapping("save")
    @ApiOperation(value = "客户信息新增数据", notes = "客户信息新增数据")
    public Result<Boolean> save(@Valid @RequestBody CustomerDto dto) {
        return Result.succ(this.customerService.save(dto));
    }

    /**
     * 修改数据
     *
     * @param dto 实体对象
     * @return 修改结果
     */
    @PutMapping("update")
    @ApiOperation(value = "客户信息修改数据", notes = "客户信息修改数据")
    public Result<Boolean> update(@RequestBody CustomerDto dto) {
        return Result.succ(this.customerService.updateById(dto));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("delete")
    @ApiOperation(value = "客户信息删除数据", notes = "客户信息删除数据")
    public Result<Boolean> delete(@RequestParam("idList") List<Serializable> idList) {
        return Result.succ(this.customerService.removeByIds(idList));
    }
}
