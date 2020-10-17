package com.aksonenko.dao;

import com.aksonenko.models.UserData;

public interface UserDao {
	UserData getUserById(int id);
}
