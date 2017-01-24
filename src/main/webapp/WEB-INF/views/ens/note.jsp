<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>

<title></title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<%@ include file="/WEB-INF/views/template/incEns/include.jsp"%>

<body>
<div id="wrapper">
	<%@ include file="/WEB-INF/views/template/incEns/navigation.jsp"%>


	<!-- Page Content -->
	<div id="page-content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					 <%@ include file="/WEB-INF/views/template/header.jsp" %>

                    <h3 style="">
                        <i class="entypo-right-circled"></i>
                        Manage Class         </h3>


                    <a href="<c:url value="/admin/classe/add"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        Add Class
                    </a>
                    <br><br>

                    <table class = "table table-hover">
                        <caption> </caption>

                        <thead>
                        <tr>
                            <th>Matiere</th>
                            <th>coefficient</th>
                            <th>designation</th>
                            <th>Type de note</th>
                            <th>Note</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${notes}" var="note" >
                            <tr>

                                <td>${note.matiere.nom}</td>
                                <td>${note.matiere.coef}</td>
                                 <td>${note.matiere.designation}</td>
                                
                               <td>${note.type}</td>
                               <td>${note.note}</td>
                              
                                    
                                
                            </tr>
                        </c:forEach>

                        </tbody>

                    </table>

                    <%@ include file="/WEB-INF/views/template/footer.jsp" %>
				
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
