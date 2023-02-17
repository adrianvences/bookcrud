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
      
    

        <h1>Edit Book</h1>

        <div class="container bg-dark" style="width: 20rem; ">
          <div class="card bg-primary border-solid" >
            <div class="card-body">
              <form:form action="/books/${book.id}" method="post" modelAttribute="book">
                <!-- model attribute has to match the one in the controller -->

                <!-- have to specify its a put request this way -->
                <input type="hidden" name="_method" value="put">
                <div class="form-control mt-3">
                  <!-- form: exposes any of its child tags to data binding  -->
                  <!-- path has to corespond to class member variable -->
                  <form:label path="title">title</form:label>
                  <form:errors path="title"/>
                  <form:input path="title"></form:input>
                </div>
                <div class="form-control mt-3">
                  <form:label path="author">author</form:label>
                  <form:errors path="author"/>
                  <form:input path="author"></form:input>
                </div>
                <div class="form-control mt-3">
                  <form:label path="pages">pages</form:label>
                  <form:errors path="pages"/>
                  <form:input path="pages"></form:input>
              
                </div>
                <input class="btn btn-dark mt-3" type="submit" value="add book">
              </form:form>
            </div>
          </div>
        </div>
      </div>

        
      
</body>
</html>