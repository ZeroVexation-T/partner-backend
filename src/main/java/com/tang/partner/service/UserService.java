package com.tang.partner.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.partner.model.domain.User;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * @author 19572
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-05-10 14:23:31
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    List<User> searchUserByTags(List<String> tagList);

    /**
     * 根据标签搜索用户
     *
     * @param tagList
     * @return
     */
}
