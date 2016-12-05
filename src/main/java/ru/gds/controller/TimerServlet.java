package ru.gds.controller;


import ru.gds.ServerTcp.SocketRunnable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Timer")
public class TimerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String userName = request.getParameter("userName").trim();
//        if (userName == null || "".equals(userName)) {
//            userName = "Guest";
//        }
//        String greetings = "Hello " + userName + "   " + SocketRunnable.getStateAist();
        response.setCharacterEncoding("cp1251");
        response.setContentType("text/plain;charset=cp1251\"");
        response.getWriter().write(SocketRunnable.getStateAist());
    }
}
