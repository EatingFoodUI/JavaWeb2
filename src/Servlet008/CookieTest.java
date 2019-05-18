package Servlet008;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieTest extends HttpServlet {
    public void Doget(HttpServletRequest request, HttpServletResponse response)
    {
        for(int i=0; i<3; i++)
        {
            Cookie cookie = new Cookie("Session-Cookie-" + i, "Cookie-Value-S" + i);
            response.addCookie(cookie);
            cookie = new Cookie("Persistent-Cookie-" + i, "Cookie-value-P" + i);
            cookie.setMaxAge(3600);
            response.addCookie(cookie);
        }
    }
}
