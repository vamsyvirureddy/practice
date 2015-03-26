<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <%--<link rel="stylesheet" type="text/css" href="css/sheet.css"/>--%>
    <link href="<c:url value="/resources/css/sheet.css" />" rel="stylesheet">
    <title>CRUD Web Application</title>
</head>
<body>
<center>

    <h1>CRUD Web Application</h1>


    <form:form commandName="person" action="/save" method="post">
        <div class="error">
            <form:errors path="*"/>
        </div>
        <table>


            <thead>
            <tr>
                <th colspan="2">add new Person</th>

            </tr>
            </thead>
            <tr>

            <tr>

                <td><label>First Name: </label></td>
                <td><form:input cssclass="input" path="name"/></td>


            </tr>
            </tr>
            <tr>
                <td><label>Last Name: </label></td>
                <td><form:input cssclass="input" path="surname"/></td>

            </tr>
            <tr>
                <td><label>Address: </label></td>
                <td><form:input cssclass="input" path="address"/></td>
            </tr>

            <tr>
                <td><label>Phone: </label></td>
                <td><form:input cssclass="input" path="phone"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" class="button" value="Save"/></td>
            </tr>
        </table>
    </form:form>

    <br/><br/>

    <a href="/" class="hyperlink">Back to person list</a>


</center>
</body>
</html>
