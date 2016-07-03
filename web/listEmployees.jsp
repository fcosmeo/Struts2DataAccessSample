<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 02/07/2016
  Time: 09:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>List Employees</title>
</head>
<body>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <s:iterator value="employees">
            <tr>
                <td><s:property value="firstName"/> </td>
                <td><s:property value="lastName"/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
