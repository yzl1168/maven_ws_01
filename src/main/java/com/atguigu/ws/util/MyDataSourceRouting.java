package com.atguigu.ws.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyDataSourceRouting extends AbstractRoutingDataSource{


	@Override
	protected Object determineCurrentLookupKey() {
		return MyDataSourceKey.getKey();
	}

}
