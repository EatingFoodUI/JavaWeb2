import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;

public class ReportFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        System.out.println(req.getRemoteHost() + " tried to access "
                           + req.getRequestURI() + " on " + new Date() + ".");
        chain.doFilter(request,response); // 传递request给下一个过滤器
    }

    public void init(FilterConfig config)
        throws ServletException{

    }

    public void destory(){}
}
