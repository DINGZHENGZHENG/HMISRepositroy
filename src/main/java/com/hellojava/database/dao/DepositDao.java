package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.hellojava.database.DBManager;
import com.hellojava.entiy.Deposit;


/**
 * 
 * @ClassName: Deposit
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-09
 * @author: yuyuanhong
 *
 */
public class DepositDao {
	
	DBManager idb=null;
	
	/**
	 * @Title: Deposit
	 * @Description: 创建DBManager实例对象
	 * @param: 
	 * @throws: 
	 *
	 */
	public DepositDao() {
		idb=new DBManager();
	}
	/**
	 * 
	 * @Title: depositQuery
	 * @Description: 病人预交押金表的查询
	 * 
	 * @param dep
	 * @return
	 * @throws SQLException Deposit
	 * @throws
	 *
	 */

	public Deposit depositQuery(Deposit dep) throws SQLException {
		Deposit de=null; 
		String sql="SELECT *FROM deposit where CarId=?";		
		Object[] objects = {dep.getCardId()};
		Connection conn=  idb.openConnection();
		ResultSet rs=   idb.query(conn, sql, objects);
		if(rs.next()) {
		  de=new Deposit();
		  de.setAccount(rs.getFloat("Account"));
		  de.setCardId(rs.getString("CardId"));
		  de.setDeposit(rs.getFloat("Deposit"));
		  de.setUserId(rs.getInt("UserId"));
		}
		idb.closeConnection(conn);
        return de;
		
	}
	/**
	 * 
	 * @Title: addDeposit
	 * @Description: 病人预交押金增加表
	 * 
	 * @param dep
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addDeposit(Deposit dep) throws SQLException {
		int a=0;
		String sql="insert into deposit(Account,Deopsit,UserId) values(?,?,?)";
		Object[]object= {dep.getAccount(),dep.getDeposit(),dep.getUserId()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, object);
		idb.closeConnection(conn);
		return a;
		
	} 
	/**
	 * 
	 * @Title: deleteDeposit
	 * @Description: 病人预交押金的删除
	 * 
	 * @param dep
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteDeposit(Deposit dep) throws SQLException {
		int a=0;
		String sql="DELETE *FROM deposit WHERE CarId=?";
		Object[] objects = {dep.getCardId()};
		Connection coon= idb.openConnection();
		a=idb.update(coon, sql, objects);
		idb.closeConnection(coon);
		return a;
		
	}
	/**
	 * 
	 * @Title: updateDeposit
	 * @Description:病人预交押金修改
	 * 
	 * @param dep
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateDeposit(Deposit dep) throws SQLException {
		int a=0;
		String sql="update deposit set Account=?,Deposit=?";
		Object[] objects= {dep.getAccount(),dep.getDeposit()};
	    Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	

}
