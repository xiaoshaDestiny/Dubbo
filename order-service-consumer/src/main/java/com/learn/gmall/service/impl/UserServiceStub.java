package com.learn.gmall.service.impl;

import java.util.List;

import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import com.learn.gmall.bean.UserAddress;
import com.learn.gmall.service.UserService;

public class UserServiceStub implements UserService {

	public final UserService userService;
		
	/**
	 * 传入的是UserService的远程代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....本地存根");
		if(!StringUtils.isEmpty(userId)){
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}
