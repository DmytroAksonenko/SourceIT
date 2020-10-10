package com.aksonenko;

import com.aksonenko.dao.UserDao;
import com.aksonenko.dao.impl.DefaultUserDao;

public class App {
	public static void main(String[] args) {
		UserDao newUserDao = new DefaultUserDao();
		System.out.println(newUserDao.getUserById(1));
	}
}
