package com.xiaojun.self.service.user;


import com.xiaojun.self.Request.UserAddOrUpdateRequest;
import com.xiaojun.self.common.ApiResponse;
import com.xiaojun.self.constant.RetCode;
import com.xiaojun.self.dao.UserMapper;
import com.xiaojun.self.po.UserPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : sxj
 * @Date : 2018/11/21 12:51
 * @Version : 1.0
 */
@Slf4j
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public ApiResponse<Integer> addNewOrUpdateUser(UserAddOrUpdateRequest userAddOrUpdateRequest){
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userAddOrUpdateRequest,userPo);
        this.userMapper.insert(userPo);
        return new ApiResponse<>(RetCode.OK,"插入成功",userPo.getId());
    }
}
