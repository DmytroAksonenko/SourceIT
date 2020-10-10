package com.aksonenko.dao.impl;

import java.sql.SQLException;

import com.aksonenko.dao.UserDao;
import com.aksonenko.db.DbUtils;
import com.aksonenko.models.UserData;

public class DefaultUserDao implements UserDao {
	
	@Override
	public UserData getUserById(int id) {
		try (var conn = DbUtils.getConnection();
			var ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
			ps.setInt(1, id);
			try (var rs = ps.executeQuery()) {
				if (rs.next()) {
					var user = new UserData();
					user.setId(rs.getInt("id"));
					user.setFirstName(rs.getString("first_name"));
					user.setLastName(rs.getString("last_name"));
					return user;
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
