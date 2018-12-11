package com.hellojava.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

	String excludeResource;
    public void init(FilterConfig fConfig) throws ServletException {
    	if(fConfig.getInitParameter("like")!=null)
    		
    		excludeResource=fConfig.getInitParameter("like");

    	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		List<String> rs=new ArrayList<String>();
		if(excludeResource!=null && !"".equals(excludeResource)) {
			String[] resources=excludeResource.split(",");
			rs=Arrays.asList(resources);
			
		}
		HttpServletRequest request1=(HttpServletRequest)request;
		HttpServletResponse response1=(HttpServletResponse)response;
		String requestResource=request1.getRequestURI().substring(request1.getRequestURI().lastIndexOf("/")+1);
		if(rs.contains(requestResource)||request1.getSession().getAttribute("user")!=null) {
			System.out.println(requestResource);
			System.out.println(request1.getSession().getAttribute("user"));
		chain.doFilter(request, response);
		}else {
			response1.sendRedirect("1.html");
			
		}
		
	}

	

	
	public void destroy() {
		
		
	}

}
