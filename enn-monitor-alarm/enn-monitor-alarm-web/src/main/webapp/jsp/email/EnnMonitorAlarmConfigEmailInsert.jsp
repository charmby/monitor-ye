<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email Insert</title>
    </head>
    
    <body>
        <h2>插入</h2>
        <form action="insert" method=get>
			GroupName <input type="text" name="groupname"><br/>
			Name <input type="text" name="name"><br/>
			Mail <input type="text" name="mail"><br/>
			<input type="submit">
		</form>

        <h2>查询结果</h2>
        <table>
	    	<c:if test="${ empty alarmEmailList}">
      			<tr>
      				<td>无记录</td>
      			</tr>  
           	</c:if>                 
       		<c:if test="${ not empty alarmEmailList}">  
               	<c:forEach  var="alarmlEmail" items="${alarmEmailList}">
               		<tr>
            			<td>${alarmlEmail}</td>
            		</tr>
              	</c:forEach>  
          	</c:if>     
	    </table>
    </body>
</html>