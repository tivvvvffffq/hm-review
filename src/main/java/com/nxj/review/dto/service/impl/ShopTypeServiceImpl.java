package com.nxj.review.dto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.review.entity.ShopType;
import com.nxj.review.mapper.ShopTypeMapper;
import com.nxj.review.dto.service.IShopTypeService;
import org.springframework.stereotype.Service;

@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

}
