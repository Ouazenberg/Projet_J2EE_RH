<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:url value="/Cv/report/${cv.idCv}/?type=xls" var="xlsURL"/>
<spring:url value="/Cv/report/${cv.idCv}/?type=pdf" var="pdfURL"/>
<a href="${xlsURL}"><button>cv en excel</button></a><br/>
<a href="${pdfURL}"><button>cv en pdf</button></a><br/>
</body>
</html>