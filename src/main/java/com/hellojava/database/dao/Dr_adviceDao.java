package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.Dr_Advice;

/**
 * 
 * @ClassName: Dr_adviceDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-09
 * @author:yu yuan hong
 *
 */
public class Dr_adviceDao {
	DBManager idb=null;
	public Dr_adviceDao() {
		idb=new DBManager();
	}
	/**
	 * 
	 * @Title: deleteBed
	 * @Description:医嘱表数据的修改
	 * 
	 * @param bed
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateDr_advice(Dr_Advice da) throws SQLException {
		int a=0;
		String sql="update bed set UserId=?,Sort=?,StartTime=?,Conten=?,StopTime=?,ExeTime=?,Signature=?,Nuse=?";
		Object[]objects= {da.getUserId(),da.getSort(),da.getStartTime(),da.getContent(),da.getStopTime(),da.getExeTime(),da.getSignature(),da.getNurse()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		return a;
		
	}

}
