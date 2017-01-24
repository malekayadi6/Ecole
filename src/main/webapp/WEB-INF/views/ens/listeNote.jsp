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
		<div class="container-fluid"><div class="row">
	      <div class="col-md-12">
	      <%@ include file="/WEB-INF/views/template/incEns/header.jsp"%>
	      
  <h3 style="">
                        <i class="entypo-right-circled"></i>
                        Gérer les notes      </h3>


                    <a href="<c:url value="/ens/notes/ajouter"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        Ajouter note
                    </a>
                    <br><br>

		<!------CONTROL TABS START------>
		<ul class="nav nav-tabs bordered">
			<li class="active"><a href='<c:url value="/ens/notes"><c:param name="id" value="${classe.idEleve}"/></c:url>'  data-toggle="tab"><i
					class="entypo-menu"></i> Liste des notes </a></li>
		
		</ul>
		<!------CONTROL TABS END------>
		<div class="tab-content">
			<!----TABLE LISTING STARTS-->
			<div class="tab-pane box active" id="list">

				<table class="table table-bordered datatable" id="table_export">
					<thead>
						<tr>
							<th><div>Matiere</div></th>
							<th><div>Coefficient</div></th>
							<th><div>Type de note</div></th>
							<th><div>Note</div></th>
					
							<th><div>modifier / Supprimer</div></th>
						</tr>

					</thead>
					<tbody>
						<!-- ?php $count = 1;foreach($subjects as $row):?> -->
						<c:forEach items="${notes}" var="note" >
<tr>
						  <td>${note.matiere.nom}</td>
                                <td>${note.matiere.coef}</td>
                                 
                                
                               <td>${note.type}</td>
                               <td>${note.note}</td>
							<td>
								<div class="btn-group">
									<button type="button"
										class="btn btn-default btn-sm dropdown-toggle"
										data-toggle="dropdown">
										Action<span class="caret"></span>
									</button>
									<ul class="dropdown-menu dropdown-default pull-right"
										role="menu">

										<!-- EDITING LINK -->
										<li>                      <a href='<c:url value="/ens/remarque"><c:param name="id" value="${note.idNote}"/></c:url>' >

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
			</div>
			<!----TABLE LISTING ENDS--->


</div>
</div>
</div>

		</div>
	</div>
</div>


<!-----  DATA TABLE EXPORT CONFIGURATIONS ----->
<script type="text/javascript">

	jQuery(document).ready(function($)
	{
		

		var datatable = $("#table_export").dataTable();
		
		$(".dataTables_wrapper select").select2({
			minimumResultsForSearch: -1
		});
	});
		
</script>

</body>
</html>