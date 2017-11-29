package com.isu.graduateproject.grainmerchant.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("userDao")
public class UserDao {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	@Transactional
	public boolean create(User user) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		
		params.addValue("username", user.getUsername());
		params.addValue("password", user.getPassword());
		params.addValue("firstname", user.getFirstname());
		params.addValue("lastname", user.getLastname());
		params.addValue("authority", user.getAuthority());
		params.addValue("enabled", user.getEnabled());
		
		jdbc.update("insert into users(username, password, firstname, lastname, enabled) values(:username, :password, :firstname, :lastname, :enabled)", params);
		return jdbc.update("insert into authorities(username, authority) values (:username, :authority)", params) == 1;
	}

}
