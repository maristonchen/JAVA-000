package com.mariston.week07.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mariston.week07.entity.dto.CustomerDto;
import com.mariston.week07.entity.po.CustomerPo;
import com.mariston.week07.entity.qo.CustomerQo;
import com.mariston.week07.entity.vo.CustomerVo;
import com.mariston.week07.mapper.CustomerMapper;
import com.mariston.week07.mapstruct.CustomerMapStruct;
import com.mariston.week07.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;

/**
 * 客户信息表(Customer)表服务实现类
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:51:50
 */
@Service("customerService")
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, CustomerPo> implements CustomerService {
    /**
     * 分页查询数据
     *
     * @param qo 查询对象
     * @return {@link Page<CustomerVo>}
     */
    @Override
    public Page<CustomerVo> queryByPage(CustomerQo qo) {
        Page<CustomerPo> page = new Page<>(qo.getPageNum(), qo.getPageSize());
        LambdaQueryWrapper<CustomerPo> queryWrapper = Wrappers.<CustomerPo>lambdaQuery().setEntity(qo.toPo());
        page = this.page(page, queryWrapper);
        Page<CustomerVo> voPage = new Page<>();
        BeanUtils.copyProperties(page, voPage);
        voPage.setRecords(CustomerMapStruct.INSTANCE.pToV(page.getRecords()));
        return voPage;
    }

    /**
     * 根据ID查询对象
     *
     * @param id id
     * @return {@link CustomerVo}
     */
    @Override
    public CustomerVo queryById(Serializable id) {
        CustomerPo po = this.getById(id);
        return Objects.nonNull(po) ? po.toVo() : null;
    }

    /**
     * 保存对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    @Override
    public boolean save(CustomerDto dto) {
        dto.setCreateTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        return this.save(dto.toPo());
    }

    /**
     * 根据ID更新对象
     *
     * @param dto 传输对象
     * @return true or false
     */
    @Override
    public boolean updateById(CustomerDto dto) {
        return this.updateById(dto.toPo());
    }
}
