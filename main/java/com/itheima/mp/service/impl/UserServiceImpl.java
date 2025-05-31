package com.itheima.mp.service.impl;

import com.itheima.mp.entity.User;
import com.itheima.mp.mapper.UserMapper;
import com.itheima.mp.service.IUserService;
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
