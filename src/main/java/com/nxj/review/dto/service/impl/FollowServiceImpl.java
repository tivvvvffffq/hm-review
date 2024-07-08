package com.nxj.review.dto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.review.dto.service.IFollowService;
import com.nxj.review.entity.Follow;
import com.nxj.review.mapper.FollowMapper;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl extends ServiceImpl<FollowMapper, Follow> implements IFollowService {

}
