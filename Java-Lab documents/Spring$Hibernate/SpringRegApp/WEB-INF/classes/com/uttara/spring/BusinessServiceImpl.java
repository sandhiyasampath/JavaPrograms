package com.uttara.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private DAO dao;
	
	public String register(RegBean bean) {
		
		System.out.println("in BSI->register() bean = "+bean);
		//impl storing bean data to db;
		
		System.out.println("inserting data = "+dao.insert(bean));
		
		return Constants.SUCCESS;
	}

}
