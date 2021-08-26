package com.xinxin.product.service.impl;

import com.xinxin.product.dataobject.ProductInfo;
import com.xinxin.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    ProductService productService;

    @Test
    void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();

        System.out.println(list.size());
    }
}