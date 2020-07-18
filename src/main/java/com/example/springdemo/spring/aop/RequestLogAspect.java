package com.example.springdemo.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Component
public class RequestLogAspect {
    private static final org.slf4j.Logger logger=LoggerFactory.getLogger(RequestLogAspect.class);

    @Pointcut("execution(public * com.example.springdemo.spring.aop..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        //接受到请求，记录请求内容
        HttpServletRequest request=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        logger.info("URL:"+request.getRequestURL());
        logger.info("IP:"+request.getRemoteAddr());

    }

    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void doAfterReturning(Object ret){
        //处理完请求，返回内容
        logger.info("RESOPNSE:"+ret);
    }

}
