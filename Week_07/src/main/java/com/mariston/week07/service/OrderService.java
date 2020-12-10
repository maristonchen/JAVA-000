package com.mariston.week07.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mariston.week07.entity.dto.OrderDto;
import com.mariston.week07.entity.po.OrderPo;
import com.mariston.week07.entity.qo.OrderQo;
import com.mariston.week07.entity.vo.OrderVo;

import java.io.Serializable;

/**
 * 订单信息表(Order)表服务接口
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:40:44
 */
public interface OrderService extends IService<OrderPo> {

    /**
     * 分页查询数据
     *
     * @param qo 查询对象
     * @return {@link Page<OrderVo>}
     */
    Page<OrderVo> queryByPage(OrderQo qo);


    /**
     * 根据ID查询对象
     *
     * @param id id
     * @return {@link OrderVo}
     */
    OrderVo queryById(Serializable id);

    /**
     * 保存对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    boolean save(OrderDto dto);


    /**
     * 根据ID更新对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    boolean updateById(OrderDto dto);
}
