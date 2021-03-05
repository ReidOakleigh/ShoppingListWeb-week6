<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopper List</title>
</head>
<body>
  <form method="post" action="deleteShopperServlet">
	<table>
		<c:forEach items="${requestScope.allShoppers}" var="currentitem" >
			<tr>
				<td><input type="radio" name="id" value="${currentitem.id}"></td>
				<td>${currentitem.shopperName}</td>
			</tr>
		</c:forEach>
	</table>
	<input type="submit" value="delete" name="doThisToItem">
  </form>
  <br/>
  <a href="index.html">Insert a new item</a>
</body>
</html>