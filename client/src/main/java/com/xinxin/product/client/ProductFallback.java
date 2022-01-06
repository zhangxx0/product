package com.xinxin.product.client;

import com.xinxin.pruduct.common.DecreaseStockInput;
import com.xinxin.pruduct.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ProductFallback implements ProductClient {
    @Override
    public String getMsg() {
        return "getMsg服务降级返回";
    }

    @Override
    public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
        log.info("获取商品列表服务降级");
        return null;
    }

    @Override
    public void decreaseStock(List<DecreaseStockInput> cartDtoList) {
        log.info("减库存服务降级");
    }
}
