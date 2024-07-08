package com.nxj.review.dto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.review.entity.User;
import com.nxj.review.mapper.UserMapper;
import com.nxj.review.dto.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
