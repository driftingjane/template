package com.xiaojun.self.controller;

import com.xiaojun.self.Request.UserAddOrUpdateRequest;
import com.xiaojun.self.common.ApiResponse;
import com.xiaojun.self.constant.RetCode;
import com.xiaojun.self.po.UserPo;
import com.xiaojun.self.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : sxj
 * @Date : 2018/11/21 14:22
 * @Version : 1.0
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("新增用户")
    @PostMapping("/addNewUser")
    public ApiResponse<Integer> addNewUser(@RequestBody UserAddOrUpdateRequest userAddOrUpdateRequest){
        try{
            return this.userService.addNewOrUpdateUser(userAddOrUpdateRequest);
        }catch (Exception e){
            log.error("新增用户异常：{}",e);
            return new ApiResponse<>(RetCode.ERROR,"新增用户失败");
        }
    }
}
