package com.xinxin.product.service;

import com.xinxin.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();


    List<ProductInfo> findList(List<String> productIdList);
}
