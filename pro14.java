import java.io.*;
import javax.srevlet.*;
import javax.servlet.http.*;

public class pro14 extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException 
    {
        String empnum = req.getParameter("empNum");
        String empnm = req.getParameter("empNm");
        String desig = req.getParameter("desig");
        String quali = req.getParameter("quali");

        res.setContentType("text/html");
        Printwriter out = res.getwriter();

        out.println("<html><body>");
        out.println("Employee Number :"+ empnum + "<br>");
        out.println("Employee Name :"+ empnm + "<br>");
        out.println("Designation :"+ desig + "<br>");
        out.println("Qualification :"+ quali + "<br>");
        out.println("</body></html>");
    }
}