/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudao.spring.aop.mainfolder;

import com.sudao.spring.aop.IMathOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shenjun
 */
public class AopMainCtx {
    public static void main(String[] args) {
        //1 创建 spring的 IoC 容器
        ApplicationContext xmlctx = new FileSystemXmlApplicationContext("src/main/resources/spring/applicationContext.xml");
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        
        //2 从 IoC 容器中获取bean的实例
        IMathOperation mathOperation = xmlctx.getBean(IMathOperation.class);
        
        //3 使用bean
        //int result = mathOperation.add(0, 100);
        mathOperation.add(0, 100);
        mathOperation.div(0, 100);
        //System.out.println("result===============================>" + result);
    }
}
