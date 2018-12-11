package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.Prescription;


public class PrescriptionDao {
	DBManager idb=null;
	public PrescriptionDao() {
	  idb=new DBManager();
		
	} 
	/**
	 * 
	 * @Title: addCheckPrice
	 * @Description: 处方表的数据增加
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException int
	 * @throws 
	 *
	 */
	public int addPrescription(Prescription cp) throws SQLException {
		int a=0;
		String sql="INSERT INTO Prescription  VALUES (?,?,?,?,?)";
		Object[]objects= {cp.getUserId(),cp.getDate(),cp.getEmpId(),cp.getDrugCode(),cp.getCount()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	/**
	 * 
	 * @Title: deleteCheckPrice
	 * @Description: 检查处方表的数据的删除
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deletePrescription(Prescription cp) throws SQLException {
		int a=0;
		String sql="DELETE *FROM Prescription WHERE PreId=?";
		Object[] objects= {cp.getPreId()};
		Connection conn=idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	/**
	 * 
	 * @Title: updateCheckPrice
	 * @Description: 处房表表数据的修改
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updatePrescription(Prescription cp) throws SQLException {
		int a=0;
		String sql="update checkprice set userId=?,date=?,empId=?,drugCode=?,count=? where preId=?";
		Object[]objects= {cp.getUserId(),cp.getDate(),cp.getEmpId(),cp.getDrugCode(),cp.getCount(),cp.getPreId()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;
		
	}
	/**
	 * 
	 * @Title: checkPriceQuery
	 * @Description:处方单数据的查询
	 * 
	 * @param cp
	 * @return
	 * @throws SQLException CheckPrice
	 * @throws
	 *
	 */
	public Prescription checkPriceQuery(Prescription cp) throws SQLException {
		Prescription cpe=null;
		String sql="select * from checkprice where preId=?";
		Object[]objects= {cp.getPreId()};
		Connection conn=idb.openConnection();
		ResultSet rs=  idb.query(conn, sql, objects);
		if(rs.next()) {
			cpe=new Prescription();
			cpe.setPreId(rs.getInt("preId"));
			cpe.setUserId(rs.getInt("userId"));
			cpe.setDate(rs.getDate("date"));
			cpe.setEmpId(rs.getInt("empId"));
			cpe.setDrugCode(rs.getString("drugCode"));
			cpe.setCount(rs.getString("count"));
			
			
		}
		idb.closeConnection(conn);
		return cpe;}

}
