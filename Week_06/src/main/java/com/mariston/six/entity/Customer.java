package com.mariston.six.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 14:10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long customerId;

    private String name;

    private Integer age;

    private LocalDateTime createTime;

}
