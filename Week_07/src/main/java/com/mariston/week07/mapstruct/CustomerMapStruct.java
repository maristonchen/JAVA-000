package com.mariston.week07.mapstruct;

import com.mariston.week07.entity.dto.CustomerDto;
import com.mariston.week07.entity.po.CustomerPo;
import com.mariston.week07.entity.qo.CustomerQo;
import com.mariston.week07.entity.vo.CustomerVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * 客户信息表(Customer) mapstruct API
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:51:53
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapStruct extends BaseMapStruct<CustomerPo, CustomerDto, CustomerVo, CustomerQo> {

    CustomerMapStruct INSTANCE = Mappers.getMapper(CustomerMapStruct.class);
}
