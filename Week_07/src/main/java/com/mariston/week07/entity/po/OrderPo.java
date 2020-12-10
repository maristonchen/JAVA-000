package com.mariston.week07.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.mariston.week07.base.LongToTimestampHandler;
import com.mariston.week07.entity.dto.OrderDto;
import com.mariston.week07.entity.qo.OrderQo;
import com.mariston.week07.entity.vo.OrderVo;
import com.mariston.week07.mapstruct.OrderMapStruct;
import lombok.*;

/**
 * 订单信息表(Order)持久化对象
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 23:40:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("t_order")
public class OrderPo extends Model<OrderPo> {
    /**
     * 主键ID
     */
    @TableId(value = "order_id", type = IdType.ASSIGN_UUID)
    private Long orderId;

    /**
     * 客户ID
     */
    @TableField("customer_id")
    private Long customerId;

    /**
     * 订单总金额
     */
    @TableField("all_amount")
    private Double allAmount;

    /**
     * 实际支付金额
     */
    @TableField("actual_amount")
    private Double actualAmount;

    /**
     * 订单状态 0-新建 1-待支付 2-待发货 3-待配送 4-已收货 5-待退货 6-待退款 7-完成交易 8-已退货
     */
    @TableField("status")
    private Integer status;

    /**
     * 支付时间
     */
    @TableField("pay_time")
    private Long payTime;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",typeHandler = LongToTimestampHandler.class)
    private Long createTime;

    /**
     * 转换成DTO
     *
     * @return {@link OrderDto}
     */
    public OrderDto toDto() {
        return OrderMapStruct.INSTANCE.pToD(this);
    }

    /**
     * 转换成QO
     *
     * @return {@link OrderQo}
     */
    public OrderQo toQo() {
        return OrderMapStruct.INSTANCE.pToQ(this);
    }

    /**
     * 转换成VO
     *
     * @return {@link OrderVo}
     */
    public OrderVo toVo() {
        return OrderMapStruct.INSTANCE.pToV(this);
    }
}
