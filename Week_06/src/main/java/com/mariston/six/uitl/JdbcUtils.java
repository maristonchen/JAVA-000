package com.mariston.six.uitl;

import com.google.common.base.CaseFormat;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 15:34
 */
public class JdbcUtils {

    public static <T> T fillValues(ResultSet rs, Class<T> clazz) {

        Method[] methods = ReflectionUtils.getDeclaredMethods(clazz);

        try {
            T obj = clazz.newInstance();

            while (rs.next()) {
                ReflectionUtils.doWithFields(clazz, field -> {
                    try {
                        //做类型转换
                        Object value = rs.getObject(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field.getName()), field.getType());
                        if (Objects.nonNull(value)) {
                            Optional<Method> method = Arrays.stream(methods).filter(m -> m.getName().lastIndexOf(StringUtils.capitalize(field.getName())) > 0
                                    && m.getParameterCount() > 0
                                    && field.getType().equals(m.getParameterTypes()[0])).findFirst();
                            if (method.isPresent()) {
                                method.get().invoke(obj, value);
                            }
                        }
                    } catch (SQLException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });
            }
            rs.close();
            return obj;
        } catch (InstantiationException | IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
