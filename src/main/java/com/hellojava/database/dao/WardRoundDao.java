package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.WardRound;

/**
 * 
 * @ClassName: WardRoundDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-10
 * @author: Wu fangqiong
 *
 */
public class WardRoundDao {
	DBManager db=null;
	/**
	 * @Title: WardRoundDao
	 * @Description: ����DBManagerʵ������
	 * @param: 
	 * @throws: 
	 *
	 */
	public WardRoundDao() {
		db=new DBManager();
	}
	/**
	 * 
	 * @Title: wrQuery
	 * @Description: סԺ����ѯ�鷿��Ϣ
	 * 
	 * @param w
	 * @return
	 * @throws SQLException WardRound
	 * @throws
	 *
	 */
	public WardRound wrQuery(WardRound w) throws SQLException{
		WardRound wr=null;
		Connection conn=db.openConnection();
		Object[] obs= {w.getWaId()};
		String sql="select * from WardRound WaId=?";
		ResultSet rs=db.query(conn, sql, obs);
		while(rs.next()) {
			wr=new WardRound();
			wr.setWaId(rs.getInt("WaId"));
			wr.setCharge(rs.getFloat("Charge"));
		}
		db.closeConnection(conn);
		return wr;
	}
	/**
	 * 
	 * @Title: addWardRound
	 * @Description: סԺ�����Ӳ鷿��Ϣ
	 * 
	 * @param wr
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addWardRound(WardRound wr) throws SQLException{
		int a=0;
		String sql="insert into WardRound(WaId,Charge) values(?,?)";
		Object[] obs= {wr.getWaId(),wr.getCharge()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;
	}
	/**
	 * 
	 * @Title: deleteWardRound
	 * @Description: סԺ���鷿��Ϣ��ɾ��
	 * 
	 * @param wr
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteWardRound(WardRound wr) throws SQLException{
		int a=0;
		String sql="delete * from WardRoud where WaId=?";
		Object[] obs= {wr.getWaId()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;
	}
	/**
	 * 
	 * @Title: updateWardRound
	 * @Description: סԺ���鷿��Ϣ���޸�
	 * 
	 * @param wr
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateWardRound(WardRound wr) throws SQLException{
		int a=0;
		String sql="update WardRound set Charge=?";
		Object[] obs= {wr.getCharge()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;	
	}
}
