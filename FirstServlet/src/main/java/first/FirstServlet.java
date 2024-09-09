package first;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
    }

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>hello Genie Ashwani.....</h1>");
		pw.println("</body></html>");
	}

}