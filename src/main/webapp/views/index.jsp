<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
    <div align="center">
        <form method="get" action="search">
            <input type="text" name="id"/>
            <input type="submit" value="search"/>
        </form>
        <h3><a href="new">Add New Product</a></h3>
        <table border="1" padding="5">
            <tr>
                <td>ID</td>
                <td>Designation</td>
                <td>Prix</td>
                <td>Quantite</td>
                <td>Action</td>
            </tr>
            <c:forEach items="${listProduit}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.designantion}</td>
                    <td>${p.prix}</td>
                    <td>${p.quantite}</td>
                    <td>
                        <a href="edit?id=${p.id}">Edit</a>&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=${p.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
