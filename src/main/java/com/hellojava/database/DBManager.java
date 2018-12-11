package com.hellojava.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.tools.DatabaseUtil;

/**
 * 
 * @ClassName: DBManager
 * @Description:���ݿ�������
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class DBManager {
	static {
		try {
			String driver=DatabaseUtil.getValue("driver");
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//��Connection�������ݿ�
	public Connection openConnection() throws SQLException {
		String url=DatabaseUtil.getValue("url");
		String username=DatabaseUtil.getValue("username");
		String password=DatabaseUtil.getValue("password");
		
		return DriverManager.getConnection(url, username, password);
	}
	//�ر�Connection����
	public void closeConnection(Connection c) throws SQLException {
		if(c!=null&&!c.isClosed()) {
			c.close();
		}
	}
	//�޸����ݿ�������(����ɾ����)������int�͵�����
	public int update(Connection c,String sql,Object...obs) throws SQLException {
		int count=0;
		if(c!=null&&!c.isClosed()) {
			PreparedStatement ps=c.prepareStatement(sql);
			if(obs!=null) {
				for (int i = 0; i < obs.length; i++) {
				ps.setObject(i+1, obs[i]);
				}
				count=ps.executeUpdate();
			}
		}
		return count;
	}
	//��ѯ���ݿ��е�����,����һ�������
	public ResultSet query(Connection c,String sql,Object...obs) throws SQLException {
		ResultSet re=null;
		if(c!=null&&!c.isClosed()) {
			PreparedStatement ps =c.prepareStatement(sql);
			if(obs!=null) {
				for (int i = 0; i < obs.length; i++) {
					ps.setObject(i+1, obs[i]);
				}
				re=ps.executeQuery();
			}
		}
		return re;
	}

	
}
