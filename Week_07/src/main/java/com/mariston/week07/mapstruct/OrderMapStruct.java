package com.mariston.week07.mapstruct;

import com.mariston.week07.entity.dto.OrderDto;
import com.mariston.week07.entity.po.OrderPo;
import com.mariston.week07.entity.qo.OrderQo;
import com.mariston.week07.entity.vo.OrderVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * 订单信息表(Order) mapstruct API
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:40:45
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapStruct extends BaseMapStruct<OrderPo, OrderDto, OrderVo, OrderQo> {

    OrderMapStruct INSTANCE = Mappers.getMapper(OrderMapStruct.class);
}
