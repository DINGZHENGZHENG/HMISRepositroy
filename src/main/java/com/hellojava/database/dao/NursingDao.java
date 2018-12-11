package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;

import com.hellojava.entiy.Nursing;

/**
 * 
 * @ClassName: NursingDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-10
 * @author: yu yuan hong
 *
 */
public class NursingDao {
	DBManager idb=null;
	public NursingDao() {
		idb=new DBManager();
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description 护理单价表数据的修改
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateNursing(Nursing nur) throws SQLException {
		int a=0;
		String sql="update nursing set Price=?,Level=?";
		Object[]objects= {nur.getPrice(),nur.getLevel()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:护理单价表的删除
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteNursing(Nursing nur) throws SQLException {
		int a=0;
		String sql="delete *from nursing where NurId=?";
		Object[]objects= {nur.getNurId()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:护理单价表的增加
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addNursing(Nursing nur) throws SQLException {
		int a=0;
		String sql="insert into nursing (Price,Level) values (?,?)";
		Object[]objects= {nur.getPrice(),nur.getLevel()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:护理单价表的删除
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public Nursing queryNursing(Nursing nur) throws SQLException {
		Nursing nu=null;
		String sql="select *from nursing where NurId=?";
		Object[]objects= {nur.getNurId()};
		Connection conn= idb.openConnection();
		ResultSet rs= idb.query(conn, sql, objects);
		if(rs.next()) {
			nu= new Nursing();
			nu.setNurId(rs.getInt("NurId"));
			nu.setLevel(rs.getString("Level"));
			nu.setPrice(rs.getShort("Price"));
		}
		idb.closeConnection(conn);
		return nu;
		
	}



}
