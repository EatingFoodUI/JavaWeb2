package Servlet008;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RepeatVisitor extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean newbie = true;
        Cookie[] cookies = request.getCookies();
        if(cookies != null)
        {
            for(int i = 0 ; i<cookies.length; i++)
            {
                Cookie c = cookies[i];
                if((c.getName().equals("repeatVisitor")) && (c.getValue().equals("yes"))){
                    newbie = false;
                    break;
            }
            }
        }

        String title;
        if(newbie){
            Cookie returnVisitorCookie = new Cookie("repeatVistor", "yes");
            returnVisitorCookie.setMaxAge(60*60*24*365);
            response.addCookie(returnVisitorCookie);
            title = "Welcome Aboard";
        }else
        {
            title = "Welcome Back";
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType = "<!DOCTYPE HTML PUBLIC \"-//WC3//DTD HTML 4.0 " +
                         "Transitional//EN\">\n";
        out.println(docType +
                    "<HTML>\n" +
                    "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                    "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                    "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                    "</BODY></HTML>");
    }
}
