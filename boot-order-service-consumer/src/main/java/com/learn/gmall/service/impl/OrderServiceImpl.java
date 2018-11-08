package com.learn.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.gmall.bean.UserAddress;
import com.learn.gmall.service.OrderService;
import com.learn.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	//@Autowired
	@Reference
	UserService userService;
	
	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("用户的Id:"+userId);
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}
}
