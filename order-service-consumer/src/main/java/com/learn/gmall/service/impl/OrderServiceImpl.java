package com.learn.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.gmall.bean.UserAddress;
import com.learn.gmall.service.OrderService;
import com.learn.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;
	
	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("�û�Id:"+userId);
		//1:��ѯ�û����ջ���ַ
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for(UserAddress userAddress:addressList){
			System.out.println("�û��ĵ�ַ��:"+userAddress.getUserAddress());
		}
		return addressList;
	}
}
