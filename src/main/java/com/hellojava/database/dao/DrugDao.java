package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;

import com.hellojava.entiy.Drug;

/**
 * 
 * @ClassName: DrugDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-10
 * @author: yu yuan hong 
 *
 */
public class DrugDao {
	DBManager idb=null;
	public DrugDao() {
		idb=new DBManager();
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:药品单价表的修改
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateDrug(Drug d) throws SQLException {
		int a=0;
		String sql="update drug set Name=?,SPEC=?,Type=?,Price=?";
		Object[]objects= {d.getName(),d.getsPEC(),d.getType(),d.getPrice()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:药品单价的删除
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteDrug(Drug d) throws SQLException {
		int a=0;
		String sql="delete *from drug where DrugCode=?" ;
		Object[]objects= {d.getDrugCode()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:药品单价表的增加
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addDrug(Drug d) throws SQLException {
		int a=0;
		String sql="insert into drug set Name=?,SPEC=?,Type=?,set Price=? ";
		Object[]objects= {d.getName(),d.getsPEC(),d.getType(),d.getPrice()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}
	/**
	 * 
	 * @Title: queryDrug
	 * @Description: 药品单价表的查询
	 * 
	 * @param d
	 * @return
	 * @throws SQLException Drug
	 * @throws
	 *
	 */
	public Drug queryDrug(Drug d) throws SQLException {
		Drug du=null;
		String sql="select *from drug where DrugCode =?";
		Object[]objects= {d.hashCode()};
		Connection conn= idb.openConnection();
		ResultSet rs=idb.query(conn, sql, objects);
		if(rs.next()) {
		  du=new Drug();
		  du.setDrugCode(rs.getInt("DrugCode"));
		  du.setName(rs.getString("Name"));
		  du.setPrice(rs.getShort("Price"));
		  du.setsPEC(rs.getString("SPEC"));
		  du.setType(rs.getString("Type"));
		}
		return du;
		
	}
	

}
