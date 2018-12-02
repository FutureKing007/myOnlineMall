package com.pingyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pingyougou.pojo.Brand;
import com.pingyougou.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    /*引用服务接口代理对象*/
//    @Autowired(required = false)
    @Reference(timeout = 10000)
    private BrandService brandService;

    @GetMapping("/brand/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }
}
