<%@ page language ="java" contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
  <title>TEST</title>
  </head>
  <body>
  <p>こんにちは</p>
  <%  System.out.println(new java.util.Date()); %>

  <%! static int add(int a, int b){
	  return a+b;
  }  %>
  <p>1+2=<%= add(1,2) %></p>

  <% static int countA=0; %>

  </body>


</html>