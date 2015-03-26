<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <%--<link rel="stylesheet" type="text/css" href="css/sheet.css"/>--%>
    <link href="<c:url value="/resources/css/sheet.css" />" rel="stylesheet">
    <title>CRUD Web Application</title>
</head>
<body>
<center>

    <h1>CRUD Web Application</h1>

    <table>
        <thead>
        <tr>

            <th>Name</th>
            <th>Surname</th>
            <th>Address</th>
            <th>Phone</th>
            <th colspan="2">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${personList}" var="p">
            <tr>

                <td><c:out value="${p.name}"/></td>
                <td><c:out value="${p.surname}"/></td>
                <td><c:out value="${p.address}"/></td>
                <td><c:out value="${p.phone}"/></td>
                <td><a href="<c:url value="/edit/${p.id}"/>">EDIT</a></td>
                <td><a href="<c:url value="/delete/${p.id}"/>">DELETE</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <br/><br/>

    <a href="/addPerson" class="button">New Person</a>


</center>
</body>
</html>
