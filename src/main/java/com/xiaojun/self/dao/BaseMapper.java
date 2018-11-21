package com.xiaojun.self.dao;


/**
 * @Author : sxj
 * @Date : 2018/11/21 12:43
 * @Version : 1.0
 */
public interface BaseMapper<T> {
    Integer insert(T bean);
}
