/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudao.spring.aop.aspect;

import java.util.Arrays;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author shenjun
 */
//把切面类声明为一个切面，需要把该类放入到IOC容器中
@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(public int com.sudao.spring.aop.IMathOperation.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method "+methodName+" begins with " + args);
    }
    
    
    
    @AfterReturning("execution(public int com.sudao.spring.aop.IMathOperation.*(int,int))")
    public void AfterReturningMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the method "+methodName+" ends with " + args);
    }
    
}
