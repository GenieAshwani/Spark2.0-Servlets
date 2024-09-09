package htmldemo;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HtmlDemo
 */
public class HtmlDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HtmlDemo() {
        super();
    
    }

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("uname");
		PrintWriter pw = response.getWriter();
		pw.println("Welcome : "+name);
	}
	

}
