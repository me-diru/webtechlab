
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class helloWorld extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, 	ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Printing Hello World </h1>");
		out.println("</body>");
		out.println("</html>");	
	}
}
