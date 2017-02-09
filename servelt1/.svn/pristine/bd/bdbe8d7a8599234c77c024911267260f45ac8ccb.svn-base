package user.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.MysqlConnectionFactory;
import user.domain.User;


public class UserDao {
	
	private String insertSql="insert into user1 (account,nickName,password,age,sex,headImag) values(?,?,?,?,?,?)";
	public void add(User user){
		Connection conn=null;
		try {
			conn=MysqlConnectionFactory.getConnection();
			PreparedStatement ps=conn.prepareStatement(insertSql);
			ps.setString(1, user.getAccount());
			ps.setString(2, user.getNickName());
			ps.setString(3,user.getPassword());
			ps.setInt(4,user.getAge());
			ps.setString(5,user.getSex());
			ps.setString(6, user.getHeadImag());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			MysqlConnectionFactory.close(conn);
		}
	}
	
	private String getSql="select account,password,nickName,age,sex,headImag from user1 where account=?";
	public User get(String account){
		Connection conn=null;
		User user=null;
		try {		
			conn=MysqlConnectionFactory.getConnection();
			PreparedStatement ps=conn.prepareStatement(getSql);
			ps.setString(1, account);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				user=new User();
				user.setAccount(rs.getString("account"));
				user.setPassword(rs.getString("password"));
				user.setNickName(rs.getString("nickName"));
				
				user.setAge(rs.getInt("age"));
				user.setSex(rs.getString("sex"));
				user.setHeadImag(rs.getString("headImag"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			MysqlConnectionFactory.close(conn);
		}
		return user;
	}
}
