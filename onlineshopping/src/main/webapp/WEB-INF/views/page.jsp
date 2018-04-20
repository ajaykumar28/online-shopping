<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>
<script >
window.menu='${title}';
</script>
  <!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">


<!-- Bootstrap DataTables -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">


<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
<div class="wrapper">
    <!-- Navigation -->
   		<%@include file="./shared/navbar.jsp"%>

    <!-- Page Content -->
   
   <div class="content">
   <!-- Loading the home content -->
   
   <c:if test="${userClickHome == true }">
	<%@include file="home.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickAllProducts == true  or userClickCategoryProducts == true}">
				<%@include file="listproducts.jsp"%>
			</c:if>
			
			
			
    <!-- /.container -->
</div >
    <!-- Footer -->
    <div class="footer">
   		<%@include file="./shared/footer.jsp"%>
   		</div >
    <!-- Bootstrap core JavaScript -->
 		<script src="${js}/jquery.js"></script>
 		
 			
    <script src="${js}/bootstrap.bundle.min.js"></script>
 		<!-- DataTable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
 		
 			<script src="${js}/myapp.js"></script>
 			
</div>
  </body>

</html>
