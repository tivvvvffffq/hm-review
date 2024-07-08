package com.nxj.review.dto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.review.dto.service.IBlogCommentsService;
import com.nxj.review.entity.BlogComments;
import com.nxj.review.mapper.BlogCommentsMapper;
import org.springframework.stereotype.Service;

@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
