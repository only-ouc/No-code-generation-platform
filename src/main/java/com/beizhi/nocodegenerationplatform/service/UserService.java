package com.beizhi.nocodegenerationplatform.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.beizhi.nocodegenerationplatform.exception.BusinessException;
import com.beizhi.nocodegenerationplatform.exception.ErrorCode;
import com.beizhi.nocodegenerationplatform.model.dto.user.UserQueryRequest;
import com.beizhi.nocodegenerationplatform.model.vo.LoginUserVO;
import com.beizhi.nocodegenerationplatform.model.vo.UserVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.beizhi.nocodegenerationplatform.model.entity.User;
import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  服务层。
 *
 * @author <a href="https://github.com/only-ouc">AI-Coding</a>
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 加密
     * @param password
     * @return加密后的用户密码
     */
    String getEncryptPassword(String password);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);


    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);


    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);


    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 根据User对象获取对应的UserVO对象
     *
     * @param user 用户实体对象，包含用户的基本信息
     * @return UserVO 视图对象，用于前端展示或数据传输
     */
    UserVO getUserVO(User user);

    /**
     * 根据用户列表获取用户视图对象列表
     *
     * @param userList 用户实体列表，包含完整的用户信息
     * @return 返回用户视图对象列表，可能包含经过处理或筛选后的用户信息
     * @throws IllegalArgumentException 如果传入的userList为null
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 根据用户查询请求参数获取查询构造器
     * @param userQueryRequest 用户查询请求对象，包含查询条件
     * @return QueryWrapper 查询构造器，用于构建数据库查询条件
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);

}
