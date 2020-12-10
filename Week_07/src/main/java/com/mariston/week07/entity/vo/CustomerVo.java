package com.mariston.week07.entity.vo;

import com.mariston.week07.entity.po.CustomerPo;
import com.mariston.week07.mapstruct.CustomerMapStruct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户信息表(Customer)视图对象
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:51:53
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("客户信息视图对象")
public class CustomerVo {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID", name = "customerId")
    private Long customerId;

    /**
     * 客户名称
     */
    @ApiModelProperty(value = "客户名称", name = "name")
    private String name;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄", name = "age")
    private Integer age;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime")
    private Long createTime;

    /**
     * 转换成PO
     *
     * @return {@link CustomerPo}
     */
    public CustomerPo toPo() {
        return CustomerMapStruct.INSTANCE.vToP(this);
    }
}
