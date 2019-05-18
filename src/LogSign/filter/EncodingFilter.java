package LogSign.filter;

import javax.servlet.*;
import java.io.IOException;

/*
    解决中文字符集乱码
 */
public class EncodingFilter implements Filter {

    public EncodingFilter(){
        System.out.println("过滤器构造");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request,response);
    }

    public void destroy(){
        System.out.println("过滤器销毁");
    }

    public void init(FilterConfig arg0) {
        System.out.println("过滤器初始化");
    }
}
