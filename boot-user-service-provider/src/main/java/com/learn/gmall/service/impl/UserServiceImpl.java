package com.learn.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.learn.gmall.bean.UserAddress;
import com.learn.gmall.service.UserService;

@Service // 暴露服务
@Component
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		//System.out.println("UserServiceImpl.....old...");
		UserAddress address1 = new UserAddress(1, "云南省昆明市呈贡区景明南路昆明理工大学", "1", "李同学", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "云南省昆明市呈贡区景明南路聚贤街", "1", "张同学", "010-56253825", "N");
		return Arrays.asList(address1,address2);
	}

}
