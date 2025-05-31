package com.itheima.mp.service.impl;

import com.itheima.mp.entity.Blog;
import com.itheima.mp.mapper.BlogMapper;
import com.itheima.mp.service.IBlogService;
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
