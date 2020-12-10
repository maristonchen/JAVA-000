package com.mariston.week07.entity.dto;

import com.mariston.week07.entity.po.OrderPo;
import com.mariston.week07.mapstruct.OrderMapStruct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单信息表(Order)传输对象
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:40:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("订单信息传输对象")
public class OrderDto {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID", name = "orderId")
    private Long orderId;

    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID", name = "customerId")
    private Long customerId;

    /**
     * 订单总金额
     */
    @ApiModelProperty(value = "订单总金额", name = "allAmount")
    private Double allAmount;

    /**
     * 实际支付金额
     */
    @ApiModelProperty(value = "实际支付金额", name = "actualAmount")
    private Double actualAmount;

    /**
     * 订单状态 0-新建 1-待支付 2-待发货 3-待配送 4-已收货 5-待退货 6-待退款 7-完成交易 8-已退货
     */
    @ApiModelProperty(value = "订单状态 0-新建 1-待支付 2-待发货 3-待配送 4-已收货 5-待退货 6-待退款 7-完成交易 8-已退货 ", name = "status")
    private Integer status;

    /**
     * 支付时间
     */
    @ApiModelProperty(value = "支付时间", name = "payTime")
    private Long payTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime")
    private Long createTime;

    /**
     * 转换成PO
     *
     * @return {@link OrderPo}
     */
    public OrderPo toPo() {
        return OrderMapStruct.INSTANCE.dToP(this);
    }
}
