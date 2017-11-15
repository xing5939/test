<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'studentlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <s:action name="student_findAll" namespace="/web">
	</s:action>
  <body>
    <table border= 1 width= 800 >
    	<tr>
    		<th>
    			<input type="checkbox" id="checkAll">
    		</th>
    		<th>序号</th>
    		<th>学生姓名</th>
    		<th>性别</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${requestScope.students}" var="student" varStatus="stat">
    	<tr>
    		<td>
    		<input type="checkbox" id="check${student.id}">
    		</td>
    		<td>${student.id}</td>
    		<td>${student.name }</td>
    		<td>
    			${student.sex }
    		</td>
    		<td><a href="#">删除</a></td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>
