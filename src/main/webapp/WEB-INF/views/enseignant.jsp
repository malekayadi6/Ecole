<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
	<%@ include file="/WEB-INF/views/template/navigation.jsp"%>


	<!-- Page Content -->
	<div id="page-content-wrapper">
		<div class="container-fluid"><div class="row">
	      <div class="col-md-12">
	      <%@ include file="/WEB-INF/views/template/incEns/header.jsp"%>
	      <br/>
	      

  <h3 style="">
                        <i class="entypo-right-circled"></i>
                        Gérer les enseignants         </h3>


                    <a href="<c:url value="/admin/enseignant/add"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        Ajouter ensiegnant
                    </a>
                    <br><br>

		<!------CONTROL TABS START------>
		<ul class="nav nav-tabs bordered">
			<li class="active"><a href="#list" data-toggle="tab"><i
					class="entypo-plus-circled"></i>Liste des enseignants </a></li>
		
					
		</ul>
		<!------CONTROL TABS END------>
		<div class="tab-content">
			<!----TABLE LISTING STARTS-->
			<div class="tab-pane box active" id="list">

               <div class="panel-body">
                    <table cellpadding="0" cellspacing="0" border="0" class="table table-bordered">
                        <caption> </caption>

                        <thead>
                        <tr>
                        <th>CIN</th>
                            <th>Nom</th>
                            <th>prenom</th>
                            <th>Date de Naissance</th>
                            <th>Lieu de naissance</th>
                            <th>Sex</th>
                            <th>Tel mobile</th>
                           
                            <th>Option</th>
	
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${enseignants}" var="enseignant" >
                            <tr>
                                <td>${enseignant.cin}</td>

                                <td>${enseignant.nom}</td>
                                <td>${enseignant.prenom}</td>
                                <td>${enseignant.dateDeNaissance}</td>
                               
                                     <td>${enseignant.lieuNaissance}</td>
                                       <td>${enseignant.sex}</td>
                                         <td>${enseignant.telMobile}</td>
                                   
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
										<li>                      <a href='<c:url value="/ens/remarque"><c:param name="id" value=""/></c:url>' >

										<i class="entypo-pencil"></i> Modifier
										</a></li>
										<li class="divider"></li>

										<!-- DELETION LINK -->
										<li><a href=>
												<i class="entypo-trash"></i> Supprimer
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
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>

</body>



</html>