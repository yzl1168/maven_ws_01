package com.atguigu.ws.mapper;

import java.util.List;

import com.atguigu.ws.bean.T_MALL_ADDRESS;
import com.atguigu.ws.bean.T_MALL_USER;

public interface MyUserMapper {

	T_MALL_USER select_t_mall_user(T_MALL_USER user);

	int insert_user(T_MALL_USER user);

	int insert_address(T_MALL_ADDRESS address);

	List<T_MALL_ADDRESS> select_t_mall_address(Integer user_id);
	
}
