package com.mariston.week07.entity.qo;

import com.mariston.week07.entity.po.OrderPo;
import com.mariston.week07.mapstruct.OrderMapStruct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * 订单信息表(Order)查询对象
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:40:45
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("订单信息查询对象")
public class OrderQo extends BaseQo {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID", name = "orderId", example = "")
    private Long orderId;

    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID", name = "customerId", example = "")
    private Long customerId;

    /**
     * 订单总金额
     */
    @ApiModelProperty(value = "订单总金额", name = "allAmount", example = "")
    private Double allAmount;

    /**
     * 实际支付金额
     */
    @ApiModelProperty(value = "实际支付金额", name = "actualAmount", example = "")
    private Double actualAmount;

    /**
     * 订单状态 0-新建 1-待支付 2-待发货 3-待配送 4-已收货 5-待退货 6-待退款 7-完成交易 8-已退货
     */
    @ApiModelProperty(value = "订单状态 0-新建 1-待支付 2-待发货 3-待配送 4-已收货 5-待退货 6-待退款 7-完成交易 8-已退货 ", name = "status", example = "")
    private Integer status;

    /**
     * 支付时间
     */
    @ApiModelProperty(value = "支付时间", name = "payTime", example = "")
    private Long payTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", name = "remark", example = "")
    private String remark;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime", example = "")
    private Long createTime;

    /**
     * 转换成PO
     *
     * @return {@link OrderPo}
     */
    public OrderPo toPo() {
        return OrderMapStruct.INSTANCE.qToP(this);
    }
}
