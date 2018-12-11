package com.hellojava.business;

import java.sql.SQLException;

import com.hellojava.database.dao.EmployeeDao;
import com.hellojava.entiy.Employee;

public class EmployeeIservImpl implements EmployeeIserv {
	private EmployeeDao  ed=null;
	public EmployeeIservImpl() {
		ed=new EmployeeDao();
	}
	public boolean loginCheckEmployee(Employee empl) {
		boolean bool=false;
	 try {
		Employee em=ed.empQuery( empl);
		if(em!=null) {
			bool=true;
			System.out.println("HH");
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return bool;
	}

}
