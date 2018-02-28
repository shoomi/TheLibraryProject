<%--
  Created by IntelliJ IDEA.
  User: Andriy
  Date: 28-Feb-18
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="head" class="secondary"></header>
<table class="table">
    <thead class="thead-inverse">
    <tr class="text-center">
        <th>id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone</th>
        <th>Time of library using</th>
        <th>Borrowing books</th>
        <th>Not returned books</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="client" items="${clients}">
    <tr>
        <td>${client.id}</td>
        <td>${client.firstName}</td>
        <td>${client.lastName}</td>
        <td>${client.phoneNumber}</td>
        <td>
            <c:forEach var="clientsBooks" items="${client.readBooks}">
                ${clientsBooks.name}
            </c:forEach>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>


<%--<c:forEach var="order" items="${orders.content}">--%>
    <%--<tr>--%>
        <%--<td class="text-center">--%>
            <%--<p>${order.time}</p>--%>
        <%--</td>--%>
        <%--<td>--%>
            <%--<c:forEach var="orderedMeal" items="${order.meals}">--%>
                <%--<img src="${orderedMeal.photoUrl}?version=${orderedMeal.version}" style="height: 50px">${orderedMeal.name}--%>
            <%--</c:forEach>--%>
        <%--</td>--%>
        <%--<td class="text-center">${order.status}</td>--%>
    <%--</tr>--%>
<%--</c:forEach>--%>