package com.arpita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class First extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        System.out.println("FirstServlet \"DoGet\" method called");
        Integer Interger=0;
        int i = Interger.parseInt(request.getParameter("num1"));
        int j = Interger.parseInt(request.getParameter("num2"));

        int k =i + j;
        PrintWriter out = response.getWriter();
        out.println("result is " + k);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        System.out.println("FirstServlet \"DoPost\" method called");
        Integer Interger=0;
        int i = Interger.parseInt(request.getParameter("num1"));
        int j = Interger.parseInt(request.getParameter("num2"));

        int k =i + j;
        PrintWriter out = response.getWriter();
        out.println("result is " + k);


    }
}