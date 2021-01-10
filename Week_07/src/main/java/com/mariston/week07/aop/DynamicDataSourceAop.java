package com.mariston.week07.aop;

import com.mariston.week07.anno.ReadOnly;
import com.mariston.week07.db.DataSourceNames;
import com.mariston.week07.db.DynamicDataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 21:51
 */
@Slf4j
@Aspect
@Component
@Order(1)
public class DynamicDataSourceAop {

    @Pointcut("@annotation(com.mariston.week07.anno.ReadOnly)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        ReadOnly ds = method.getAnnotation(ReadOnly.class);
        if (ds == null) {
            DynamicDataSource.setDataSource(DataSourceNames.MAIN_DATA_SOURCE_NAME);
            log.debug("set datasource is " + DataSourceNames.MAIN_DATA_SOURCE_NAME);
        } else {
            DynamicDataSource.setDataSource(ds.name());
            log.debug("set datasource is " + ds.name());
        }

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSource();
            log.debug("clean datasource");
        }
    }
}
