package com.hand.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hand.service.CustomerCheck;

public class LoginServlet extends HttpServlet {
	private CustomerCheck cc = new CustomerCheck();

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=null;
		String password=null;
		name=request.getParameter("user");
		password=request.getParameter("password");
		System.out.println(name);
		ResultSet rs =null;
		
		RequestDispatcher rd = null;
		String foward = null;
		if(name==null||password==null){
			System.out.println("----------------------------");
			foward="error.jsp";
			request.setAttribute("msg", "用戶名或密码不能爲空");
			rd = request.getRequestDispatcher(foward);
			rd.forward(request, response);
		}else{
			boolean bool = cc.check(name,password);
			System.out.println("執行結果"+bool);
			if(bool){
				rs = cc.getrs(name);
				HttpSession session = request.getSession();
				session.setAttribute("result", rs);
				foward = "index.jsp";

			}else{
				request.setAttribute("msg", "用戶名不存在");
				foward="error.jsp";
				
			}
			rd = request.getRequestDispatcher(foward);
			rd.forward(request, response);
		}
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		
		
	}

}
