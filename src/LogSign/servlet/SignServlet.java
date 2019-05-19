package LogSign.servlet;

import LogSign.dao.UserDao;
import LogSign.dao.UserDaoImpl;
import LogSign.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String home = request.getParameter("home");
        String info = request.getParameter("info");

        User user = new User();
        user.setHome(home);
        user.setName(name);
        user.setPwd(pwd);
        user.setSex(sex);
        user.setInfo(info);

        UserDao ud = new UserDaoImpl();

        if(ud.register(user))
        {
            request.setAttribute("username", name);
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        else
        {
            response.sendRedirect("index.jsp");
        }
    }
}
