package com.hellojava.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.EmployeeIserv;
import com.hellojava.business.EmployeeIservImpl;
import com.hellojava.entiy.Employee;

 /**
 * 
 * @ClassName: LoginServlet
 * @Description: ְ����Ա��¼
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
@WebServlet(value= {"/loginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	/**
	 * <p>Title: LoginServlet</p>
	 * <p>Description:��ȡ�û���¼��Ϣ
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String EmpName= request.getParameter("userName"); 
		String password=request.getParameter("userPwd");
//        System.out.println(EmpName);
//		System.out.println(password);
		boolean boo=false;
		if(password!=null) {
		  Employee emp= new Employee();
		  emp.setEmpName(EmpName);
		  emp.setPassword(password);
		 EmployeeIserv emi= new EmployeeIservImpl();
		 boo=emi.loginCheckEmployee(emp);
		}
		response.setCharacterEncoding("utf-8");
	 if(boo) {
		 response.sendRedirect("inner/main.html");
	 }else {
		 response.sendRedirect("inner/bed.html");
	 }
		response.getWriter().print(boo?1:0);
	}

}
