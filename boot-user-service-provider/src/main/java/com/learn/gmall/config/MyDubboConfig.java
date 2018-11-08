package com.learn.gmall.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.learn.gmall.service.UserService;

@Configuration
public class MyDubboConfig {
		
//	<dubbo:application name="user-service-provider"></dubbo:application>
	@Bean
	public ApplicationConfig applicationConfig(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("boot-user-service-provider");
		return applicationConfig;
	}
	
//	<dubbo:registry address="zookeeper://127.0.0.1:2181"></dubbo:registry>
	@Bean
	public RegistryConfig registryConfig(){
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol("zookeeper");
		registryConfig.setAddress("127.0.0.1:2181");
		return registryConfig;
	}
	
//	<dubbo:protocol name="dubbo" port="20880"></dubbo:protocol>
	@Bean
	public ProtocolConfig protocolConfig(){
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(20880);
		return protocolConfig;
	}
	
	@Bean
	public ServiceConfig<UserService> userServiceConfig(UserService userService){
		ServiceConfig<UserService> userServiceConfig = new ServiceConfig<>();
		userServiceConfig.setInterface(UserService.class);
		userServiceConfig.setRef(userService);
		userServiceConfig.setValidation("1.0.0");
		
		//配置每一个Method的信息
		MethodConfig methodConfig = new MethodConfig();
		methodConfig.setName("getUserAddressList");
		methodConfig.setTimeout(2000);
		
		//将每一个方法都关联到Service中
		List<MethodConfig> method = new ArrayList<>();
		method.add(methodConfig);
		
		return userServiceConfig;
	}

}
