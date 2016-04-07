<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/inc.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>中化</title>
</head>
<body>
<c:forEach var="item" items="${obj}">
<c:if test="${item.age>22}">
以下人员年龄大于22岁
</c:if>
<c:out value="${item.name}"/>,<c:out value="${item.age}"/>,<c:out value="${item.sex}"/>  <BR>
</c:forEach>

</body>
</html>