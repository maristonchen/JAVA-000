package com.mariston.week07.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mariston.week07.entity.dto.OrderDto;
import com.mariston.week07.entity.po.OrderPo;
import com.mariston.week07.entity.qo.OrderQo;
import com.mariston.week07.entity.vo.OrderVo;
import com.mariston.week07.mapper.OrderMapper;
import com.mariston.week07.mapstruct.OrderMapStruct;
import com.mariston.week07.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Objects;

/**
 * 订单信息表(Order)表服务实现类
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:40:44
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderPo> implements OrderService {
    /**
     * 分页查询数据
     *
     * @param qo 查询对象
     * @return {@link Page<OrderVo>}
     */
    @Override
    public Page<OrderVo> queryByPage(OrderQo qo) {
        Page<OrderPo> page = new Page<>(qo.getPageNum(), qo.getPageSize());
        LambdaQueryWrapper<OrderPo> queryWrapper = Wrappers.<OrderPo>lambdaQuery().setEntity(qo.toPo());
        page = this.page(page, queryWrapper);
        Page<OrderVo> voPage = new Page<>();
        BeanUtils.copyProperties(page, voPage);
        voPage.setRecords(OrderMapStruct.INSTANCE.pToV(page.getRecords()));
        return voPage;
    }

    /**
     * 根据ID查询对象
     *
     * @param id id
     * @return {@link OrderVo}
     */
    @Override
    public OrderVo queryById(Serializable id) {
        OrderPo po = this.getById(id);
        return Objects.nonNull(po) ? po.toVo() : null;
    }

    /**
     * 保存对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    @Override
    public boolean save(OrderDto dto) {
        return this.save(dto.toPo());
    }

    /**
     * 根据ID更新对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    @Override
    public boolean updateById(OrderDto dto) {
        return this.updateById(dto.toPo());
    }
}
