package com.dao;

import org.springframework.stereotype.Component;

@Component
public class CamDao {
	public CamDao() {
		System.out.println("CamDao :: Constructor");
	}
}


// It is not print in the package because it not follows the naming convention
// If we give the same name then it will print 
// Name like (com.codingtips) this.