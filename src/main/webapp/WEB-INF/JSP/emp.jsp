<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
  
 <form action="zezeze">
 <input type="text" name="cname" >
  <select name="iphone.id" >
    <option value=""> --please choose-- </option>
    <c:forEach items="${iphone}" var="asd" >
    <option value="${asd.id}" >${asd.iname}</option>   
    </c:forEach>
  </select>
 
  <input type="submit" value=" 好" >
</form>
  <button>删除</button>
  <table border="1" >
   <tr>
   <td>品牌id</td>
   <td>名称</td>
   <td>尺寸</td>
   <td>手机</td>
   <td align="center" colspan="2">操作</td>
   <td></td>
   </tr> 
      
   
   <c:forEach items="${computer}" var="aa" >
   <tr>     
   <td><input type="checkbox" name="cid" value="${aa.cid}">${aa.cid}</td>
   <td>${aa.cname}</td>
   <td>${aa.csize}</td>
   <td>${aa.iphone.iname}</td>
   <td><a href="del?cid=${aa.cid}" ><button>删除</button></a></td>
   <td><a href="updates?cid=${aa.cid}">修改</a></td>
    </tr>
   </c:forEach>
   

  </table>
  
  <form action="Add">
  <input type="text" name="cname">
  <input type="text" name="csize" >
   <select name="iphone.id" >
    <option value=""> --please choose-- </option>
    <c:forEach items="${iphone}" var="asd" >
    <option value="${asd.id}">${asd.iname}</option>
    
    </c:forEach>
  </select>
  <input type="submit" value="添加" >
  </form>

</body>
</html>