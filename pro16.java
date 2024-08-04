import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class pro16 extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        Printwriter out = res.getwriter();
        out.println("<html><body>");

        out.println("Host :" + req.getHeader("Host") + "<br>");
        out.println("User-Agent :" + req.getHeader("User-Agent") + "<br>");
        out.println("Accept-Language :" + req.getHeader("Accept-Language ") + "<br>");
        out.println("Accept-Encoding :" + req.getHeader("Accept-Encoding") + "<br>");
        out.println("Connection :" + req.getHeader("Connection") + "<br>");

        out.println("</body></html>");
    }
}