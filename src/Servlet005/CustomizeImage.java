package Servlet005;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomizeImage extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String referer = request.getHeader("Referer");
        if(referer == null)
        {
            referer = "<I>none</I>";
        }
        String title = "Referring page: " + referer;
        String imageName;
        if(contain(referer, "JRun")){
            return;
        }
    }

    private boolean contain(String mainString, String subString) {
        return(mainString.indexOf(subString) != -1);
    }
}
