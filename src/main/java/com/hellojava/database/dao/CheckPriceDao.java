package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.CheckPrice;

/**
 * 
 * @ClassName: CheckPriceDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-09
 * @author: yu yuan hong
 *
 */
public class CheckPriceDao {
	DBManager idb=null;
	public CheckPriceDao() {
	  idb=new DBManager();
		
	} 
	/**
	 * 
	 * @Title: addCheckPrice
	 * @Description: 检查化验单价表的数据增加
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addCheckPrice(CheckPrice cp) throws SQLException {
		int a=0;
		String sql="INSERT INTO checkprice (InspItem,Price) VALUES (?,?)";
		Object[]objects= {cp.getInspItem(),cp.getPrice()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteCheckPrice
	 * @Description: 检查化验单价表的数据的删除
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteCheckPrice(CheckPrice cp) throws SQLException {
		int a=0;
		String sql="DELETE *FROM checkprice WHERE InspId=?";
		Object[] objects= {cp.getInspId()};
		Connection conn=idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	/**
	 * 
	 * @Title: updateCheckPrice
	 * @Description: 检查化验单表数据的修改
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateCheckPrice(CheckPrice cp) throws SQLException {
		int a=0;
		String sql="update checkprice set InspItem=?,Price=?";
		Object[]objects= {cp.getInspItem(),cp.getPrice()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	/**
	 * 
	 * @Title: checkPriceQuery
	 * @Description:检查化验单价数据的查询
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException CheckPrice
	 * @throws
	 *
	 */
	public CheckPrice checkPriceQuery(CheckPrice cp) throws SQLException {
		CheckPrice cpe=null;
		String sql="select *from checkprice where InspId=?";
		Object[]objects= {cp.getInspId()};
		Connection conn=idb.openConnection();
		ResultSet rs=  idb.query(conn, sql, objects);
		if(rs.next()) {
			cpe=new CheckPrice();
			cpe.setInspId(rs.getInt("InspId"));
			cpe.setInspItem(rs.getString("tInspItem"));
			cpe.setPrice(rs.getShort("Price"));
			
		}
		idb.closeConnection(conn);
		return cpe;}

}
