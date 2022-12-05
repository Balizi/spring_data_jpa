<%@ page import="com.example.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Product> productList = (List<Product>) request.getAttribute("listProduit");
%>
    <div align="center">
        <h1>${message}</h1>
        <form method="get" action="search">
            <input type="text" name="keyboard"/>
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
            <% for (Product p:productList ) {%>
                <tr>
                    <td><%=p.getId()%></td>
                    <td><%=p.getDesignantion()%></td>
                    <td><%=p.getPrix()%></td>
                    <td><%=p.getQuantite()%></td>
                    <td>
                        <a href="edit?id=<%=p.getId()%>">Edit</a>&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=<%=p.getId()%>">Delete</a>
                    </td>
                </tr>
            <%}%>
        </table>
    </div>
</body>
</html>
