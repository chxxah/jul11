<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main</h1>

	<c:forEach begin="1" end="10" var="i">
	
		<c:choose>
			<c:when test="${i eq 3 }">
			3입니다. <br>
			</c:when>
			<c:otherwise>
			${i }<br>
			</c:otherwise>
		</c:choose>
	</c:forEach>
		
		set<br>
		<!-- 변수선언 -->
		<!-- 케이라는 변수를 만들것임 -->
		<c:set var="k" value="케이"/>
		${k }
		
		<!-- 똑같은 변수명을 값을 바꿔줄 때 --> 
		<c:set var="k">새로운 값</c:set>
		
		EL태그로 출력
		
		${k }
		
		out명령어로 출력
		<br>
		out = ${var }
		<!-- 글자 케이를 찍어줌 -->
		<c:out value="k"></c:out>
		<!-- k의 변수를 찍어줌 -->
		<c:out value="${k }"></c:out>
		
		jsp는 찍어주는 역할
		M = Model = data
		V = View = jsp
		C = Controller = 흐름 제어
		
		
		<hr>
		<!-- k라는 변수 삭제 -->
		<c:remove var="k"/>
		${k }
		
		${list }
		
		
		<c:forEach items="${list }" var="i">
		 ${i }<br>
		</c:forEach>
		
		
		
		
		

</body>
</html>