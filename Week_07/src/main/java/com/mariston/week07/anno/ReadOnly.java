package com.mariston.week07.anno;

import com.mariston.week07.db.DataSourceNames;

import java.lang.annotation.*;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 21:49
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReadOnly {

    String name() default DataSourceNames.MAIN_DATA_SOURCE_NAME;

}
