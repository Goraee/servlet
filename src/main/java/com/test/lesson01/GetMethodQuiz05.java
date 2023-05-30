package com.test.lesson01;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz05")
public class GetMethodQuiz05 extends HttpServlet{
	
	@Override //상속있을때만 할 수 있으니
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		int number = Integer.parseInt(request.getParameter("number")); // 단수
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><titel>구구단</title></head><body><ul>");
		for (int i = 1; i <=9; i++) {
			out.print("<li>" + number + " x " + i + "=" + (number*i) + "</li>");
		}
		out.println("</ul></body></html>");
//		int num = Integer.parseInt(request.getParameter("num"));
//		for ( int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {	
//			}
//		};
//		out.print("num");
//		
	}
}
