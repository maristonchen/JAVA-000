package com.mariston.week07.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mariston.week07.entity.dto.CustomerDto;
import com.mariston.week07.entity.po.CustomerPo;
import com.mariston.week07.entity.qo.CustomerQo;
import com.mariston.week07.entity.vo.CustomerVo;

import java.io.Serializable;

/**
 * 客户信息表(Customer)表服务接口
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:55:21
 */
public interface CustomerService extends IService<CustomerPo> {

    /**
     * 分页查询数据
     *
     * @param qo 查询对象
     * @return {@link Page<CustomerVo>}
     */
    Page<CustomerVo> queryByPage(CustomerQo qo);


    /**
     * 根据ID查询对象
     *
     * @param id id
     * @return {@link CustomerVo}
     */
    CustomerVo queryById(Serializable id);

    /**
     * 保存对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    boolean save(CustomerDto dto);


    /**
     * 根据ID更新对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    boolean updateById(CustomerDto dto);
}
