package com.abner.service.core.impl;

import com.abner.dao.core.UserAuthDao;
import com.abner.entity.core.po.UserAuth;
import com.abner.service.core.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoreServiceImpl implements CoreService {

    @Autowired
    private UserAuthDao userAuthDao;

    @Override
    public String login(String identifier, String identityType, String certificate) {

        // 取得用户信息
        UserAuth userAuth = userAuthDao.getUserAuthByIdentifier(identifier);

        return userAuth.toString();
    }

    @Override
    public String sendVerifyCode(String mobile) {
        return null;
    }

    @Override
    public String getUser(String token) {
        return null;
    }

    @Override
    public String checkUserToken(String token) throws Exception {
        return null;
    }
}
