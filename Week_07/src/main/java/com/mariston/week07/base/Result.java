package com.mariston.week07.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/12/10 22:57
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<D> {

    private String code;

    private String message;

    private D data;


    public static <D> Result<D> succ(D d) {
        return Result.<D>builder().data(d).build();
    }
}
