package com.hh;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 15-12-10.
 */
public class Test extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","张三");
       // req.getRequestDispatcher("/main.jsp");
       // resp.sendRedirect("/main.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/main.jsp");
        dispatcher .forward(req, resp);
    }
}
