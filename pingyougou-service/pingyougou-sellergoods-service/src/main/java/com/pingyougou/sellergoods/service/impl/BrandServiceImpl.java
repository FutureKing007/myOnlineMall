package com.pingyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pingyougou.mapper.BrandMapper;
import com.pingyougou.pojo.Brand;
import com.pingyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(interfaceName = "com.pingyougou.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
