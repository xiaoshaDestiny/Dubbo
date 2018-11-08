package com.learn.gmall.service.impl;

import java.util.List;

import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import com.learn.gmall.bean.UserAddress;
import com.learn.gmall.service.UserService;

public class UserServiceStub implements UserService {

	public final UserService userService;
		
	/**
	 * �������UserService��Զ�̴������
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....���ش��");
		if(!StringUtils.isEmpty(userId)){
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}
