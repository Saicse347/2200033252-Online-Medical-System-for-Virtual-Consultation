package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.user;

public class userDAO {
	private Connection con;

	public userDAO(Connection con) {
		super();
		this.con = con;
	}
	public boolean register(user u)
	{ 
		boolean f=false;
		try {
			
			String sql="insert into user(fullname,email,password) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			
			int i=ps.executeUpdate();
			if(i==1) 
			{
				f=true;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;
	}
}
