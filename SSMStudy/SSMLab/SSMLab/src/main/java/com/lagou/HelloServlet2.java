package com.lagou;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello idea 更改
        PrintWriter out = response.getWriter();

        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        LinkedList<Integer> integers = new LinkedList<>();
        integers.isEmpty();
    }


    }