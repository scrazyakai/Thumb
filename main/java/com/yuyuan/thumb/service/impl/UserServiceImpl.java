package com.yuyuan.thumb.service.impl;

import com.yuyuan.thumb.entity.User;
import com.yuyuan.thumb.mapper.UserMapper;
import com.yuyuan.thumb.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
