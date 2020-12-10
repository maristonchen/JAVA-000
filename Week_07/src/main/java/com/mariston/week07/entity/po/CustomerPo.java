package com.mariston.week07.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.mariston.week07.base.LongToTimestampHandler;
import com.mariston.week07.entity.dto.CustomerDto;
import com.mariston.week07.entity.qo.CustomerQo;
import com.mariston.week07.entity.vo.CustomerVo;
import com.mariston.week07.mapstruct.CustomerMapStruct;
import lombok.*;

/**
 * 客户信息表(Customer)持久化对象
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020-12-10 22:53:33
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("t_customer")
public class CustomerPo extends Model<CustomerPo> {
    /**
     * 主键ID
     */
    @TableId(value = "customer_id", type = IdType.AUTO)
    private Long customerId;

    /**
     * 客户名称
     */
    @TableField("name")
    private String name;

    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",typeHandler = LongToTimestampHandler.class)
    private Long createTime;

    /**
     * 转换成DTO
     *
     * @return {@link CustomerDto}
     */
    public CustomerDto toDto() {
        return CustomerMapStruct.INSTANCE.pToD(this);
    }

    /**
     * 转换成QO
     *
     * @return {@link CustomerQo}
     */
    public CustomerQo toQo() {
        return CustomerMapStruct.INSTANCE.pToQ(this);
    }

    /**
     * 转换成VO
     *
     * @return {@link CustomerVo}
     */
    public CustomerVo toVo() {
        return CustomerMapStruct.INSTANCE.pToV(this);
    }
}
