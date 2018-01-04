package com.atguigu.ws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.ws.bean.T_MALL_ADDRESS;
import com.atguigu.ws.bean.T_MALL_USER;
import com.atguigu.ws.mapper.MyUserMapper;
import com.atguigu.ws.util.MyDataSourceKey;
import com.atguigu.ws.util.MyDataSourceRouting;

public class MyUserServiceImp implements MyUserServiceInf {
	@Autowired
	private MyUserMapper myUserMapper;
	@Override
	public T_MALL_USER get_user(T_MALL_USER user) {
		//设置使用哪个数据源（这里要使用本地线程的方式保证数据源key的安全）
		MyDataSourceKey.setKey("1");
		
		return myUserMapper.select_t_mall_user(user);
	}
	@Override
	public Boolean regist_user(T_MALL_USER user) {
		int  i = myUserMapper.insert_user(user);
		if(i==1){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public Boolean add_address(T_MALL_ADDRESS address) {
		
		int i = myUserMapper.insert_address(address);
		if(i==1){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public List<T_MALL_ADDRESS> get_address(Integer user_id) {
		List<T_MALL_ADDRESS> list_address = new ArrayList<T_MALL_ADDRESS>();
		list_address = myUserMapper.select_t_mall_address(user_id);
		return list_address;
	}

}
