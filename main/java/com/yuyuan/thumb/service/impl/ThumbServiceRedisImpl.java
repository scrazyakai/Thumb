@Override
public boolean undoThumb(HttpServletRequest request, ThumbDTO thumbDTO) {
    if (user == null || blogId == null) {
        throw new RuntimeException("参数错误");
    }
    User user = userService.getLoginUser(request);
    Long blogId = thumbDTO.getBlogId();
    // 获取时间戳
    String timeSlice = getTimeSlice();
    // Redis Key
    String tempThumbKey = RedisKeyUtil.getTempThumbKey(timeSlice);
    String userThumbKey = RedisKeyUtil.getUserThumbKey(user.getId());
    // 将 user.getId() 和 blogId 转换为字符串
    String userIdStr = String.valueOf(user.getId());
    String blogIdStr = String.valueOf(blogId);

    // 执行Redis脚本
    long result = redisTemplate.execute(
            RedisLuaScriptConstant.UNTHUMB_SCRIPT,
            Arrays.asList(tempThumbKey, userThumbKey),
            userIdStr,
            blogIdStr
    );

    // 日志记录：打印Redis脚本执行结果
    log.info("Redis script execution result: {}", result);

    // 检查Redis脚本返回的状态码
    if (result == LuaStatusEnum.FAIL.getValue()) {
        // 修改异常信息，明确问题原因
        throw new RuntimeException("Redis脚本执行失败，用户未点赞");
    }

    // 返回结果
    return result == LuaStatusEnum.SUCCESS.getValue();
}
