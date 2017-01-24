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
				 <%@ include file="/WEB-INF/views/template/header.jsp" %>

                    <h3 style="">
                        <i class="entypo-right-circled"></i>
                        Les Messages         </h3>


                    <a href="<c:url value="/parent/envoyermsg"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        Envoyer Message
                    </a>
                    <br><br>

                    <table class = "table table-hover">
                        <caption> </caption>

                        <thead>
                        <tr>
                            <th>From</th>
                            <th>Objet</th>
                            <th>Lire</th>
                            
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${messages}" var="message" >
                            <tr>

                                <td>${message.ens.nom}</td>
                                <td>${message.objet}</td>
                                 <td><button type="button" class="btn btn-success">Ouvrire</button></td>
                                
                              
                              
                              
                                    
                                
                            </tr>
                        </c:forEach>

                        </tbody>

                    </table>

                    <%@ include file="/WEB-INF/views/template/footer.jsp" %>
			</div>
		</div>
	</div>
</div>
</body>
</html>
