<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
<form action="updatesss">
  <c:forEach items="${asd}" var="asd" >
  <input type="hidden" name="cid" value="${asd.cid}" >
  <input type="text" name="cname" value="${asd.cname}" >
   <input type="text" name="csize" value="${asd.csize}" >
      </c:forEach>
    <select name="iphone.id" >
    <c:forEach items="${happy}" var="aa" >
    <option value="${aa.id}" >${aa.iname}</option>
    </c:forEach>
    </select>
   <input type="submit" value="确认修改" >
       
</form>

</body>
</html>