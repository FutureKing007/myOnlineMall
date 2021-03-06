package com.pingyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pingyougou.mapper.BrandMapper;
import com.pingyougou.pojo.Brand;
import com.pingyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service(interfaceName = "com.pingyougou.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public void save(Brand brand) {
        brandMapper.insertSelective(brand);
    }

    @Override
    public void update(Brand brand) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public Brand findOne(Serializable id) {
        return null;
    }

//    @Override
//    public List<Brand> findAll() {
//        return null;
//    }

    @Override
    public List<Brand> findByPage(Brand brand, int page, int rows) {
        return null;
    }

    @Override
    public List<Brand> findAll() {
////        return brandMapper.findAll();
//        PageInfo<Brand> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(new ISelect() {
//            @Override
//            public void doSelect() {
//                brandMapper.selectAll();
//            }
//        });
//        System.out.println("总记录数:" + pageInfo.getTotal());
//        System.out.println("总页数: " + pageInfo.getPages());
//        return pageInfo.getList();
        return brandMapper.selectAll();
    }
}
