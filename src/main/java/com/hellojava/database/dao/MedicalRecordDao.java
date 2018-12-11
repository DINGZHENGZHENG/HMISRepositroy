package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.MedicalRecord;

/**
 * 
 * @ClassName: MedicalRecordDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-10
 * @author: Wu fangqiong
 *
 */
public class MedicalRecordDao {
	DBManager db=null;
	/**
	 * @Title: MedicalRecordDao
	 * @Description: 创建DBManager的实例对象
	 * @param: 
	 * @throws: 
	 *
	 */
	public MedicalRecordDao() {
		db=new DBManager();
	}
	/**
	 * 
	 * @Title: mrQuery
	 * @Description: 住院部病历的查询
	 * 
	 * @param m
	 * @return
	 * @throws SQLException MedicalRecord
	 * @throws
	 *
	 */
	public MedicalRecord mrQuery(MedicalRecord m) throws SQLException{
		MedicalRecord mr=null;
		Connection conn=db.openConnection();
		Object[] obs= {m.getmRId()};
		String sql="select * from MedicalRecord where MRId=?";
		ResultSet rs=db.query(conn, sql, obs);
		while(rs.next()) {
			mr=new MedicalRecord();
			mr.setmRId(rs.getInt("MRId"));
			mr.setUserId(rs.getInt("UserId"));
			mr.setDate(rs.getDate("Data"));
			mr.setEmpId(rs.getInt("EmpId"));
			mr.setContext(rs.getString("Context"));
		}
		db.closeConnection(conn);
		return mr;
	}
	/**
	 * 
	 * @Title: addMedicalRecord
	 * @Description: 住院部病历的增加
	 * 
	 * @param mr
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addMedicalRecord(MedicalRecord mr) throws SQLException {
		int a=0;
		String sql="insert into MedicalRecord(MRId,UserId,Data,EmpId,Context)";
		Object[] obs= {mr.getmRId(),mr.getUserId(),mr.getDate(),mr.getEmpId(),mr.getContext()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;
	}
	/**
	 * 
	 * @Title: deleteMedicalRecord
	 * @Description: 住院部病历的删除
	 * 
	 * @param mr
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteMedicalRecord(MedicalRecord mr) throws SQLException{
		int a=0;
		String sql="delete * from MedicalRecord where mRId=?";
		Object[] obs= {mr.getmRId()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return  a;
		
	}
	/**
	 * 
	 * @Title: updateMedicalRecord
	 * @Description: 住院部病历的修改
	 * 
	 * @param mr
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateMedicalRecord(MedicalRecord mr)throws SQLException{
		int a=0;
		String sql="update MedicalRecord set UserId=?,getDate=?,EmpId=?,Context=?";
		Object[] obs= {mr.getUserId(),mr.getDate(),mr.getEmpId(),mr.getContext()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;
	}
	
}

