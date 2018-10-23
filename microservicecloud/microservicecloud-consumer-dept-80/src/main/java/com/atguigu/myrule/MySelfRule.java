package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.07.24 15:15
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // Ribbon默认是轮询，我自定义为随机
        //return new RandomRule();
        // 我自定义为每台机器5次
        return new RandomRule_ZY();
    }
}