package practice.practicedemo.springboot.springcache.service;

import practice.practicedemo.springboot.springcache.pojo.User;

/**
 * @Author Simple
 * @Create 2021/6/28 15:05
 */
public interface UserService {

    /**
     * 获取用户
     * @return user
     */
    User findUser();

    /**
     * 更新用户信息
     * @return user
     */
    User updateUser();

    /**
     * 清除缓存的用户信息
     */
    void clearUser();

}