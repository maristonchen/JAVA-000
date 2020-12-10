package com.mariston.week07.entity.qo;

import com.mariston.week07.entity.po.CustomerPo;
import com.mariston.week07.mapstruct.CustomerMapStruct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * 客户信息表(Customer)查询对象
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:51:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("客户信息查询对象")
public class CustomerQo extends BaseQo {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID", name = "customerId", example = "")
    private Long customerId;

    /**
     * 客户名称
     */
    @ApiModelProperty(value = "客户名称", name = "name", example = "")
    private String name;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄", name = "age", example = "")
    private Integer age;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime", example = "")
    private Long createTime;

    /**
     * 转换成PO
     *
     * @return {@link CustomerPo}
     */
    public CustomerPo toPo() {
        return CustomerMapStruct.INSTANCE.qToP(this);
    }
}
