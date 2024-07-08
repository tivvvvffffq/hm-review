package com.nxj.review.dto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.review.dto.service.IUserInfoService;
import com.nxj.review.entity.UserInfo;
import com.nxj.review.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
