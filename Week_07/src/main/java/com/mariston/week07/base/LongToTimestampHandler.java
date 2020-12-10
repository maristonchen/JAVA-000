package com.mariston.week07.base;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.*;
import java.util.Objects;

/**
 * LONG与TIMESTAMP转换器
 *
 * @author mariston
 * @version V1.0
 * @since 2016/10/21
 */
@MappedJdbcTypes(JdbcType.TIMESTAMP)
public class LongToTimestampHandler extends BaseTypeHandler<Long> {


    /**
     * 设置非空参数
     *
     * @param ps        预处理语句
     * @param i         参数位置
     * @param parameter 参数
     * @param jdbcType  sql数据类型
     * @throws SQLException SQL异常
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Long parameter, JdbcType jdbcType) throws SQLException {
        Timestamp timestamp = Objects.nonNull(parameter) ? new Timestamp(parameter) : null;
        ps.setTimestamp(i, timestamp);
    }

    /**
     * 根据列名获取结果
     *
     * @param rs         结果集
     * @param columnName 列名
     * @return string
     * @throws SQLException SQL异常
     */
    @Override
    public Long getNullableResult(ResultSet rs, String columnName) throws SQLException {
        //获取时间
        Timestamp timestamp = rs.getTimestamp(columnName);
        return (timestamp == null) ? null : timestamp.getTime();
    }

    /**
     * 根据列index获取结果
     *
     * @param rs          结果集
     * @param columnIndex 列index
     * @return string
     * @throws SQLException SQL异常
     */
    @Override
    public Long getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        //获取时间
        Timestamp timestamp = rs.getTimestamp(columnIndex);

        return (timestamp == null) ? null : timestamp.getTime();
    }

    /**
     * 根据列index获取结果
     *
     * @param cs          结果集
     * @param columnIndex 列index
     * @return string
     * @throws SQLException SQL异常
     */
    @Override
    public Long getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        //获取时间
        Timestamp timestamp = cs.getTimestamp(columnIndex);
        return (timestamp == null) ? null : timestamp.getTime();
    }
}
