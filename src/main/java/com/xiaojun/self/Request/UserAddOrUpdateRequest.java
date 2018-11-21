package com.xiaojun.self.Request;

import lombok.Data;

/**
 * @Author : sxj
 * @Date : 2018/11/21 13:03
 * @Version : 1.0
 */
@Data
public class UserAddOrUpdateRequest {
    private String phone;
    private String name;
    private String nickName;
    private String password;
}
