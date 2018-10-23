package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
 * @author: zhenglongsu@163.com
 * @date: 2018.07.21 11:10
 */
@Configuration
public class ConfigBean {

    /**
     * Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端  负载均衡工具
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @Bean
    public IRule myRule() {
        return new RetryRule();
    }


}
