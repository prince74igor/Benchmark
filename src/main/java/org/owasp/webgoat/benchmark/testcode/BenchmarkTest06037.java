package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest06037")
public class BenchmarkTest06037 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getQueryString();
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map43098 = new java.util.HashMap<String,Object>();
		map43098.put("keyA-43098", "a Value"); // put some stuff in the collection
		map43098.put("keyB-43098", param.toString()); // put it in a collection
		map43098.put("keyC", "another Value"); // put some stuff in the collection
		bar = (String)map43098.get("keyB-43098"); // get it back out
		
		
		java.io.File file = new java.io.File(bar);
	}
}