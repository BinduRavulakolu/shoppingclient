<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>

<br>

<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Item Id</th>
      <th scope="col">Product Id</th>
      <th scope="col">Quantity</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="i" items="${sessionScope.cartItems}">
    <tr>
      <th scope="row">${i.itemId}</th>
      <td>${i.productId}</td>
      <td>${i.quantity}</td>
      <td>${i.total}</td>
    </tr>
    </c:forEach>
    
  </tbody>
</table>

</body>
</html>