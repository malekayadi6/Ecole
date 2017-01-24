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
	<%@ include file="/WEB-INF/views/template/incParent/navigation.jsp"%>


	<!-- Page Content -->
	<div id="page-content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					 <%@ include file="/WEB-INF/views/template/header.jsp" %>

                    <h3 style="">
                        <i class="entypo-right-circled"></i>
                        Les remarques         </h3>


                
                    <br><br>
                    <hr/>

                    <table class = "table table-hover">
                        <caption> </caption>

                        <thead>
                        <tr>
                            <th>Numéro</th>
                            <th>Enseignant</th>
                            <th>Remarque</th>
                       
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${remarques}" var="remarque" >
                            <tr>

                                <td>${remarque.idRemarque}</td>
                                <td>${remarque.enseignant.nom}</td>
                                 <td>${remarque.rem}</td>                                                                                           
                                
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
