package com.learn.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.learn.gmall.bean.UserAddress;
import com.learn.gmall.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	
	@ResponseBody		//讲数据以json格式的字符输出到界面上
	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid") String userId){
		return orderservice.initOrder(userId);
	}

}
