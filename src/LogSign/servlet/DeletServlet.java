package LogSign.servlet;

import LogSign.dao.UserDao;
import LogSign.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        UserDao ud = new UserDaoImpl();

        if(ud.delete(userId))
        {
            request.setAttribute("xiaoxi","删除成功");
            request.getRequestDispatcher("/Searchall").forward(request,response);
        }
        else
        {
            response.sendRedirect("index.jsp");
        }
    }
}
