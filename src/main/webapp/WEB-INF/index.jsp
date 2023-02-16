<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

  <!-- <c:out value="${books}"></c:out>  THIS JUST SHOWS MEMORY LOCATION-->
  <table class="table">
    <c:forEach var="book" items="${books}">
      <tr>
        <td><a href="/books/${book.id}">${book.title}</a></td>
        <td>${book.author}</td>
        <td>${book.pages}</td>
      </tr>
    </c:forEach>
  </table>
  <div class="container align-items-center ">
    <div class="card bg-primary" style="width: 20rem;">
      <h1 class="bg-dark text-light">Book</h1>
      <p>I really like <c:out value="${title}"></c:out> by 
      <c:out value="${author}"></c:out> , it is only
      <c:out value="${pages}"></c:out> long!!!</p>
      <a class="btn btn-dark" href="/books/new">Add a Book</a>
    </div>
  </div>
</body>
</html>
