import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class pro12 extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/ntel");
    Printwriter out = res.getwriter(); 
    out.println("<html><body>");
 
    out.println("<h1>T.N.Rao College</h1>")
    out.println("<h2>T.N.Rao College</h2>")
    out.println("<h3>T.N.Rao College</h3>")
    out.println("<h4>T.N.Rao College</h4>")
    out.println("<h5>T.N.Rao College</h5>")
    out.println("<h6>T.N.Rao College</h6>")
   
    out.println("</body></html");
    }
}