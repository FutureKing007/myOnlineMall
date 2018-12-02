package com.pingyougou.mapper;

import com.pingyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    /*查询全部品牌*/
    @Select("SELECT * FROM tb_brand ORDER BY id ASC ")
    List<Brand> findAll();
}
