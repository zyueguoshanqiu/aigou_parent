package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.AppBrand_8002;
import cn.itsource.aigou.service.IProductTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes =AppBrand_8002.class)
public class ProductTypeServiceImplTest {
    @Autowired
    public ProductTypeServiceImpl productTypeService;

    @Test
    public void treeData() {
//        System.out.println(productTypeService.getChildByid(0l));
//        System.out.println(productTypeService.treeDataRecursion(0l));
        System.out.println(productTypeService.treeData());
    }
}