package com.zszf.wms.service.impl;

import com.zszf.wms.entity.User;
import com.zszf.wms.mapper.UserMapper;
import com.zszf.wms.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zszf
 * @since 2023-01-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
