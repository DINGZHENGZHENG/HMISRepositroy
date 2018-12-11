package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.Department;

/**
 * 
 * @ClassName: DepartmentDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.
 * @Data: 2018-12-10
 * @author: Wu fangqing
 *
 */
public class DepartmentDao {
	DBManager db=null;

	/**
	 * @Title: DepartmentDao
	 * @Description: 创建DBManager的实例对象
	 * @param: 
	 * @throws: 
	 *
	 */
	public DepartmentDao() {
		db=new DBManager();
	}
	
	/**
	 * 
	 * @Title: addDepartment
	 * @Description: 住院部科室的增加操作
	 * 
	 * @param depa
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int addDepartment(Department depa) throws SQLException {
		int a=0;
		String sql="insert into department(DepId,DepName) values(?,?)";
		Object[] obs={depa.getDepId(),depa.getDepName()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;	
	}
	
	/**
	 * 
	 * @Title: deleteDepartment
	 * @Description: 住院部科室的删除操作
	 * 
	 * @param depa
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int deleteDepartment(Department depa)throws SQLException{
		int  a=0;
		String sql="delete * from Department where DepId=?";
		Object[] obs= {depa.getDepId()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;
	}
	
	/**
	 * 
	 * @Title: updateDepartment
	 * @Description: 住院部科室的修改操作
	 * 
	 * @param depa
	 * @return
	 * @throws SQLException int
	 * @throws
	 *
	 */
	public int updateDepartment(Department depa) throws SQLException{
		int a=0;
		String sql="update Department set DepName=?";
		Object[] obs= {depa.getDepName()};
		Connection conn=db.openConnection();
		a=db.update(conn, sql, obs);
		db.closeConnection(conn);
		return a;
	}
	
	/**
	 * 
	 * @Title: depaQuery
	 * @Description:住院部科室的查询操作
	 * 
	 * @param d
	 * @return
	 * @throws SQLException Department
	 * @throws
	 *
	 */
	public Department depaQuery(Department d) throws SQLException{
		Department depa=null;
		Connection conn=db.openConnection();
		Object[] obs= {d.getDepId()};
		String sql="select * from Department where DepId=?";
		ResultSet rs=db.query(conn, sql, obs);
		while(rs.next()) {
			depa=new Department();
			depa.setDepId(rs.getInt("DepId"));
			depa.setDepName(rs.getString("=DepName"));
		}
		db.closeConnection(conn);
		return depa;
	}	

}
