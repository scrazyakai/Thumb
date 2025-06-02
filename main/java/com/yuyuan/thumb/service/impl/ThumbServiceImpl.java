package com.yuyuan.thumb.service.impl;

import com.yuyuan.thumb.service.IThumbService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // 确保该实现类被优先选择为默认Bean
@Service
public class ThumbServiceImpl implements IThumbService {
    // 实现类代码
}