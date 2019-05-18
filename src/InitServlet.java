import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InitServlet")
public class InitServlet extends HttpServlet {
    private String firstName = "First name is missing";
    private String emailAddress = "Email address is missing";

    public void init()
    {
        ServletConfig Config = getServletConfig();
        if(Config.getInitParameter("firstName")!=null)
        {
            firstName = Config.getInitParameter("firstName");
        }
        if(Config.getInitParameter("emailAddress")!=null)
        {
            emailAddress = Config.getInitParameter("emailAddress");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uri = request.getRequestURI();
        String docType =
                "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><meta charset=\"utf-8\"><title>" + firstName + "</title></head>\n"+
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + emailAddress + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>Header 名称</th><th>Header 值</th>\n"+ firstName +
                "</tr>\n");
    }
}
