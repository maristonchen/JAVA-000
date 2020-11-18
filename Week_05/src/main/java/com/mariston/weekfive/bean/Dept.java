package com.mariston.weekfive.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

    private int id;

    private String name;

    private String code;

}
