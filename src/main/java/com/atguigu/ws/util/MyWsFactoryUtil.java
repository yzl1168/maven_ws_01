package com.atguigu.ws.util;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


public class MyWsFactoryUtil {
	
	public static <T> T getWsImp(String url,Class<T> t){
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = 	new JaxWsProxyFactoryBean(); 
		jaxWsProxyFactoryBean.setAddress(url);
		T create = jaxWsProxyFactoryBean.create(t);
		return create;
	}
}
