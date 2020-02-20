package com.buy.service.product;

import com.buy.dao.product.IProductCategoty;
import com.buy.dao.product.ProductCategoryImpl;
import com.buy.entity.EasybuyProductCategory;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryServiceImpl implements IProductCategoryService{
    private IProductCategoty productCategoty=new ProductCategoryImpl();

    @Override
    public List<EasybuyProductCategory> queryAllProductCategory(String parentId) {
        parentId="0";
        return productCategoty.queryAllProductCategory(parentId);
    }
}
