package com.yuyuan.thumb.controller;

import com.yuyuan.thumb.service.IThumbService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThumbController {

    private final IThumbService thumbService;

    public ThumbController(@Qualifier("thumbServiceImpl") IThumbService thumbService) {
        this.thumbService = thumbService;
    }

    // 其他控制器代码
}