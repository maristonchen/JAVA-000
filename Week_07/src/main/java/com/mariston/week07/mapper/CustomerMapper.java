package com.mariston.week07.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mariston.week07.entity.po.CustomerPo;
import org.springframework.stereotype.Repository;

/**
 * 客户信息表(Customer)表数据库访问层
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:51:49
 */
@Repository
public interface CustomerMapper extends BaseMapper<CustomerPo> {

}
