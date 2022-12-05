<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
    <div align="center">
        <h2>Add Product</h2>
        <form:form action="save" method="post" modelAttribute="product">
            <table cellpadding="5">
                <tr>
                    <td>Designantion : </td>
                    <td><form:input path="designantion" /> </td>
                </tr>
                <tr>
                    <td>Prix : </td>
                    <td><form:input path="prix" /> </td>
                </tr>
                <tr>
                    <td>Quantite : </td>
                    <td><form:input path="quantite" /> </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Save"/></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
