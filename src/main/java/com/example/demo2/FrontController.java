package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


// hello -> board
// you -> hi
// go -> bye
@WebServlet("/*") // /*은 식별자 자리에 모든 식별자를 붙일 수 있다는거다.
public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String value = req.getRequestURI();

        // 라우터
        if(value.equals("/you")){
            resp.getWriter().println("hi");
        }else if(value.equals("/hello")){
            resp.getWriter().println("board");
        }else if(value.equals("/go")){
            resp.getWriter().println("bye");
        } else if (value.equals("/kdt")) {
            resp.getWriter().println("aaa");

        }


    }
}