package com.learn.gmall.service;

import java.util.List;

import com.learn.gmall.bean.UserAddress;

/**
 * 用户服务接口
 *
 */
public interface UserService {
	
	/**
	 * 按照用户的ID返回�?有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

}
