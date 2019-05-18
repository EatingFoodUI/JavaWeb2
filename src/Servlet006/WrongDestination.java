package Servlet006;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WrongDestination extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userAgent = request.getHeader("User-Agent");
        if((userAgent != null) && (userAgent.indexOf("MSIE") != -1))
        {
            response.sendRedirect("http://home.netscape.com");
        }
        else
        {
            response.sendRedirect("http://www.microsoft.com");
        }
    }
}
