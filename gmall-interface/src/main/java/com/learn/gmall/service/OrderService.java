package com.learn.gmall.service;

import java.util.List;

import com.learn.gmall.bean.UserAddress;

public interface OrderService {

	/**
	 * ��ʼ������
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);
}
