import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class pro13 extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        String unm = req.getParameter("username");

        res.setContentType("text/html")
        Printwriter out = res.getwriter();

        out.println("<html><body>");
        out.println("<h1>Welcome " + unm + "</h1>")
        out.println("</body></html>");
    }
}