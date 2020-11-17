package com.mariston.weekfour.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/17 23:50
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String name;

    private int age;
}
