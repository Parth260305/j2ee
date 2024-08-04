import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class pro11 extends HttpServlet 
{  
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
        res.setContentType("text/html");
        Printwriter out = res.getwriter();
        out.println("<html><body>");
        out.println("<h1>Hello World</h1>");
        out.println("</body></html");
    }
}