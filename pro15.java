import java.io.*;
import javax.srevlet.*;
import javax.servlet.http.*;

public class pro15 extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        Printwriter out = res.getwriter();

        out.println("<html><body>");

        Enumration paranm = req.getParameterNames();
        while(ParameterNames.hasMoreElements())
        {
            String paraNm = paranm.nextElement();
            String[] paraval = req.getParameterValues(paraNm);
            out.println(paraNm + ":");
            for(String value : paraval)
            {
                out.println(value + " ");
            }
        }
        out.println("</body></html>");
    }
}