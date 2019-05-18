import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String doCType = "<!DOCTYPE HTML PUBLIC \" -//W3C//DTD HTML 4.0 " +
                        "Transitional//EN\">\n";
        out.println(doCType +
                "<HTML>\n" +
                "<HEAD><TITLE>hello</TITLE></HEAD>\n" +
                "</HTML>");
    }
}
