package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest04701")
public class BenchmarkTest04701 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = "";
		java.util.Enumeration<String> names = request.getParameterNames();
		if (names.hasMoreElements()) {
			param = names.nextElement(); // just grab first element
		}
		
		
		// Chain a bunch of propagators in sequence
		String a58059 = param; //assign
		StringBuilder b58059 = new StringBuilder(a58059);  // stick in stringbuilder
		b58059.append(" SafeStuff"); // append some safe content
		b58059.replace(b58059.length()-"Chars".length(),b58059.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map58059 = new java.util.HashMap<String,Object>();
		map58059.put("key58059", b58059.toString()); // put in a collection
		String c58059 = (String)map58059.get("key58059"); // get it back out
		String d58059 = c58059.substring(0,c58059.length()-1); // extract most of it
		String e58059 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d58059.getBytes() ) )); // B64 encode and decode it
		String f58059 = e58059.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String bar = thing.doSomething(f58059); // reflection
		
		
		String sql = "UPDATE USERS SET PASSWORD='" + bar + "' WHERE USERNAME='foo'";
				
		try {
			java.sql.Statement statement = org.owasp.webgoat.benchmark.helpers.DatabaseHelper.getSqlStatement();
			int count = statement.executeUpdate( sql );
		} catch (java.sql.SQLException e) {
			throw new ServletException(e);
		}
	}
}