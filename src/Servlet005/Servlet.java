package Servlet005;

import Servlet003.ServletUtilities;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title,message;
        String userAgent = request.getHeader("User-Agent");
        if((userAgent!=null) && (userAgent.indexOf("MSIE")!=-1))
        {
            title = "Micorsoft Minion";
            message = "welcome";
        }
        else
        {
            title = "Hopeless";
            message = "welcome";
        }
        out.println(ServletUtilities.headWithTitle(title) +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +
                "<B>message</B>" + message + "<BR>\n" +
                "</BODY></HTML>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
