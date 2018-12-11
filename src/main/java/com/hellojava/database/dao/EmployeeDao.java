package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.Employee;



/**
 * 
 * @ClassName: EmployeeDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class EmployeeDao {
	DBManager idb=null;
	/**
	 * @Title: EmployeeDao
	 * @Description: TODO
	 * @param: 
	 * @throws: 
	 *
	 */
	public EmployeeDao () {
		idb=new DBManager();
		
	}
	
	/**
	 * 
	 * @Title: empQuery
	 * @Description: 查询所有职工信息
	 * 
	 * @param empl
	 * @return
	 * @throws SQLException Employee
	 * @throws
	 *
	 */
	public Employee empQuery(Employee empl) throws SQLException {
		Employee  emp=null;
		String sql="select *from employee where password=? and EmpId=?";
		Object[] odObjects= {empl.getPassword(),empl.getEmpId()};
		Connection conn=  idb.openConnection();
		ResultSet rs= idb.query(conn, sql, odObjects);
		if(rs.next()) {
			emp=new Employee();
			emp.setDepId(rs.getInt("DepId"));
			emp.setEmpAddress(rs.getString("EmpAddress"));
			emp.setEmpId(rs.getInt("EmpId"));
			emp.setEmpName(rs.getString("EmpName"));
			emp.setEmpPhone(rs.getString("EmpPhone"));
			emp.setEmpSex(rs.getString("EmpSex"));
			emp.setEmpType(rs.getString("EmpType"));
			emp.setPassword(rs.getString("password"));
		    }
		idb.closeConnection(conn); 
		return emp;
		}
	
    /**
     * @throws SQLException 
     * 
     * @Title: addEmployee
     * @Description: 添加职工人员信息
     * 
     * @param emp
     * @return int
     * @throws
     *
     */
    public int addEmployee(Employee emp) throws SQLException {
		int a=0;
		String sql="INSERT INTO employee (DepId,EmpAddress,EmpId,EmpName,EmpPhone,EmpSex,EmpType,password) VALUES (?,?,?,?,?,?,?,?)";
		Object[] objects= {emp.getDepId(),emp.getEmpAddress(),emp.getEmpId(),emp.getEmpName(),emp.getEmpPhone(),emp.getEmpSex(),emp.getEmpType(),emp.getPassword()};
		Connection conn= idb.openConnection();
		a= idb.update(conn, sql, objects);
		idb.closeConnection(conn);
		return a;}
    /**
     * @throws SQLException 
     * 
     * @Title: updateEmployee
     * @Description: 修改职工信息
     * 
     * @param emp
     * @return int
     * @throws
     *
     */
    public int updateEmployee(Employee emp) throws SQLException {
    	int a=0;
        String sql="update employee set DepId=?,EmpAddress=?,EmpName=?, EmpPhone=?,EmpSex=?,EmpType=?,password=? where EmpId=? ";
		Object[] objects= {emp.getDepId(),emp.getEmpAddress(),emp.getEmpName(),emp.getEmpPhone(),emp.getEmpSex(),emp.getEmpType(),emp.getPassword()};
		Connection conn= idb.openConnection();
		a=idb.update(conn, sql, objects);
		idb.closeConnection(conn);
        return a;}
    /**
     * 
     * @Title: deleteEmployee
     * @Description: 删除职工人员信息
     * 
     * @param emp
     * @return
     * @throws SQLException int
     * @throws
     *
     */
    public int deleteEmployee(Employee emp) throws SQLException {
    	String sql="delete *from employee where EmpId=?";
    	Object[]objects= {emp.getEmpId()};
    	Connection conn= idb.openConnection();
    	int a=idb.update(conn, sql, objects);
    	idb.closeConnection(conn);
		return a;}

}
