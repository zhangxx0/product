package com.xinxin.product.client;

import org.springframework.context.annotation.Bean;

public class SentinelFeignConfig {

    @Bean
    public ProductFallback instance() {
        return new ProductFallback();
    }

}
