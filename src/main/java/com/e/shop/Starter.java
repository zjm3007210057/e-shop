package com.e.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 * Created by zjm on 2017/5/8.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Starter
{
    /**
     * 程序入口
     * @param args 参数组
     */
    public static void main(String[] args)
    {
        SpringApplication.run(Starter.class, args);
    }
}
