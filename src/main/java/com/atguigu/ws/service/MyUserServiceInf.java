package com.atguigu.ws.service;

import java.util.List;

import javax.jws.WebService;

import com.atguigu.ws.bean.T_MALL_ADDRESS;
import com.atguigu.ws.bean.T_MALL_USER;

@WebService
public interface MyUserServiceInf {
	//用户登录验证
	public T_MALL_USER get_user(T_MALL_USER user);
	
	//用户注册
	public Boolean regist_user(T_MALL_USER user);
	
	//添加地址
	public Boolean add_address(T_MALL_ADDRESS address);
	
	//获取地址
	
	public List<T_MALL_ADDRESS> get_address(Integer user_id);
	
	
	
	
}
