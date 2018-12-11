package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.Bed;

/**
 * 
 * @ClassName: BedDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-09
 * @author: yu yuan hong
 *
 */
public class BedDao {
	DBManager idb=null;
	public BedDao() {
		idb=new DBManager();
	}
	/**
	 * 
	 * @Title: addBed
	 * @Description: 床位的增加
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addBed(Bed bed) throws SQLException {
		int a=0;
		String sql="INSERT INTO bed (DepName,BedState,BedPrice,Sort) VALUES (?,?,?,?)";
		Object[]objects= {bed.getDepName(),bed.getBedState(),bed.getBedPrice(),bed.getSort()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:床位表的删除
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteBed(Bed bed) throws SQLException {
		int a=0;
		String sql="delete *from bed where BedId=?";
		Object[]objects= {bed.getBedId()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:床位表的修改
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateBed(Bed bed) throws SQLException {
		int a=0;
		String sql="update bed set DepName=?,BedState=?,BedPrice=?,Sort=?";
		Object[]objects= {bed.getDepName(),bed.getBedState(),bed.getBedPrice(),bed.getSort()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:床位表的查询
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public Bed queryeBed(Bed bed) throws SQLException {
		Bed b=null;
		String sql="select *from bed where BebId=?";
		Object[]objects= {bed.getBedId()};
		Connection conn= idb.openConnection();
		ResultSet rs=idb.query(conn, sql, objects);
		if(rs.next()) {
		  b=new Bed();
		 b.setBedPrice(rs.getInt("BedPrice"));
		 b.setBedId(rs.getInt("BedId"));
		 b.setBedState(rs.getString("BedState"));
		 b.setDepName(rs.getString("DepName"));
		}
		idb.closeConnection(conn);
		return b;
		
	}
	
	

}
