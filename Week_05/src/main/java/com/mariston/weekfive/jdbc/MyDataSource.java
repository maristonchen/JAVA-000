package com.mariston.weekfive.jdbc;

import lombok.*;

import java.sql.Connection;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyDataSource extends DataSource {

    private Connection connection;

}
