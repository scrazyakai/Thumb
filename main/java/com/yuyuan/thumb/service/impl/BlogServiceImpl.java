package com.yuyuan.thumb.service.impl;

import com.yuyuan.thumb.entity.Blog;
import com.yuyuan.thumb.mapper.BlogMapper;
import com.yuyuan.thumb.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 凯哥
 * @since 2025-05-29
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
