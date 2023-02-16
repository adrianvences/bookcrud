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
      
      <div class="container align-items-center">
        <h1>Add a Book</h1>
        <div class="card bg-dark" style="width: 20rem; height: auto;">
          <div class="card-body  align-items-center bg-dark">
            <form action="/books" method="POST">
              <div class="form-control align-items-center bg-primary">
                title: <input type="text" name="title" id="" class="mt-2">
                <br>
                author: <input type="text" name="author" id="" class="mt-2">
                <br>
                pages: <input type="number" name="pages" id="" class="mt-2">
                <br>
                <input class="btn btn-dark mt-3" type="submit" value="add book">
              </div>
            </form>
          </div>
        </div>

        <h1>New and improved</h1>

        <form:form action="/books" method="post" modelAttribute="book">

          <div class="form-control">
            <form:label path="title">title</form:label>
            <form:input path="title"></form:input>
          </div>
          <div class="form-control">
            <form:label path="author">author</form:label>
            <form:input path="author"></form:input>
          </div>
          <div class="form-control">
            <form:label path="pages">pages</form:label>
            <form:input path="pages"></form:input>
            
          </div>
          <input class="btn btn-dark mt-3" type="submit" value="add book">

        </form:form>
      </div>

        
      
</body>
</html>