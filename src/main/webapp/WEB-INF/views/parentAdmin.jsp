<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>

    <title></title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


    <%@ include file="/WEB-INF/views/template/include.jsp" %>

<body>

<div id="wrapper">
    <%@ include file="/WEB-INF/views/template/navigation.jsp" %>


    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <%@ include file="/WEB-INF/views/template/header.jsp" %>

                    
                    <h3 style="">
                        <i class="entypo-right-circled"></i>
                     Gérer les parents          </h3>
                    <hr>


                    <a href="<c:url value="/admin/parent/add"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                       Ajouter parent
                    </a>
                    <br><br>

                    <table class="table table-hover">
                        <caption></caption>

                        <thead>
                        <tr>
                           <th>CIN</th>
                            <th>Nom</th>
                            <th>Prenom</th>
                            <th>Date de naissance</th>
                            <th>Lieu de naissance</th>
                            <th>Sex</th>
                            <th>tel Mobile</th>
                            <th>Fonction</th>
                            <th>Action</th>
                            
	
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${parents}" var="parent">
                            <tr>

                               <td>${parent.cin}</td>
                                 <td>${parent.nom}</td>
                                <td>${parent.prenom}</td>
                                <td>${parent.dateDeNaissance}</td>
                                <td>${parent.lieuNaissance}</td>
                                                                <td>${parent.sex}</td>
                                                                <td>${parent.telMobile}</td>
                                                                <td>${parent.fonction}</td>
                                                             
                                
                                
                           
                                    
                                               <td>
                                                    <div class="btn-group">
									<button type="button"
										class="btn btn-default btn-sm dropdown-toggle"
										data-toggle="dropdown">
										Action <span class="caret"></span>
									</button>
									<ul class="dropdown-menu dropdown-default pull-right"
										role="menu">

										<!-- EDITING LINK -->
																				<li>                      <a href='<c:url value="/admin/eleves"><c:param name="id" value="${parent.id}"/></c:url>' >


										 Affiche eleves
										</a></li>
										<li class="divider"></li>

										<!-- DELETION LINK -->
										<li>                                        <a href="<spring:url value="/admin/eleves/${parent.id}"/>">

												<i class="entypo-trash"></i> Supprimer
										</a></li>
										<li>                                        <a href="<spring:url value="/admin/parent/delete/${parent.id}"/>">

												<i class="entypo-pencil"></i> Modifier 
										</a></li>
									</ul>
								</div>
                                    </td>
                            </tr>
                        </c:forEach>

                        </tbody>

                    </table>

                    <%@ include file="/WEB-INF/views/template/footer.jsp" %>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
    $("#menu-toggle").click(function (e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>

</body>


</html>