package com.sample.app;

import java.io.*;  
import java.sql.*;  

import javax.servlet.ServletException;  
import javax.servlet.http.*;  

import org.drools.runtime.ExecutionResults;
  
public class Register extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String acc=request.getParameter("account").toString();  
int i=Integer.parseInt(acc);
System.out.println(Test2.Droolmethod(i ));


          
try{  

      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  
