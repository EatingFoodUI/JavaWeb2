import Servlet003.ServletUtilities;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LotteryNumbers extends HttpServlet {
    private long modTime;
    private int[] numbers = new int[10];

    public void init()
    {
        modTime = System.currentTimeMillis();
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = randomNum();
        }
        numbers[9] = 100;
    }

    private int randomNum(){
        return ((int)(Math.random()) * 100);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "you numbers";
        out.println(ServletUtilities.headWithTitle(title) +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n");
        for(int i = 0; i < numbers.length; i++)
        {
            out.println(" <LI>" + numbers[i]);
        }
        out.println("</OL" + "</BODY></HTML>");
    }

    public long getLastModified(HttpServletRequest request)
    {
        return(modTime);
    }
}
