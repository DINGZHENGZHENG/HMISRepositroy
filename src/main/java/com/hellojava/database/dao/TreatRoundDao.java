package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.TreatRound;

public class TreatRoundDao {
	private DBManager db=null;
	
	public TreatRoundDao() {
		db=new DBManager();
	}
	
	//查询满足treId条件的数据
	public TreatRound Query(TreatRound t) throws SQLException {
		TreatRound tre=null;
		Connection c=db.openConnection();
		String sql="select * from TreatRound where TreId=?";
		Object[] obs= {t.getTreId()};
		ResultSet re=db.query(c, sql, obs);
		
		while(re.next()) {
			tre=new TreatRound();
			tre.setTreId(re.getInt("TreId"));
			tre.setTreName(re.getString("TreName"));
			tre.setTrePrice(re.getFloat("TrePrice"));
		}
		db.closeConnection(c);
		return tre;
	}
	
	//删除满足treId的数据
	public int delete(TreatRound t) throws SQLException {
		int d=0;
		Connection c=db.openConnection();
		String sql="delete from treatround where treId=?";
		Object[] obs= {t.getTreId()};
		d=db.update(c, sql, obs);
		return d;
	}
	
	//修改
	public int update(TreatRound t) throws SQLException {
		int d=0;
		Connection c=db.openConnection();
		String sql="update treatround set TreName=?,TreName=? where TreId=?";
		Object[] obs= {t.getTreId()};
		d=db.update(c, sql, obs);
		return d;
	}
	
	//
	public int add(TreatRound t) throws SQLException {
		int d=0;
		Connection c=db.openConnection();
		String sql="insert into treatround(TreId,TreName,TreName) values(default,?,?)";
		Object[] obs= {t.getTreName(),t.getTrePrice()};
		d=db.update(c, sql, obs);
		return d;
	}
	
	
	
	
}
