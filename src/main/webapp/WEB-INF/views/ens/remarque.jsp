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

		<!------CONTROL TABS START------>
		<ul class="nav nav-tabs bordered">
			<li class="active"><a href="#list" data-toggle="tab"><i
					class="entypo-plus-circled"></i>Ajouter Remarque </a></li>
		
					
		</ul>
		<!------CONTROL TABS END------>
		<div class="tab-content">
			<!----TABLE LISTING STARTS-->
			<div class="tab-pane box active" id="list">

				          <div class="panel-body">
                                        <h3 id="s" style="color:green;"> ${msg}</h3>
                                    <form:form action="${pageContext.request.contextPath}/ens/remarque/add"
                                               class="form-horizontal form-groups-bordered validate" commandName="remarque"
                                               method="post">
                                     
                                    <div class="form-group">
                                    <label for="field-3" class="col-sm-3 control-label"> <h4> Remarque pour <strong> ${remarque.eleve.nom }  ${remarque.eleve.prenom } <strong></h4></label>
                                    </div>
                                    <br/> 
                                    <div class="form-group">
                                        <label for="field-3" class="col-sm-3 control-label">Eleve</label>

                                        <div class="col-sm-5">

                                            <form:select name="class_id" class="form-control"  id="class_id" path="eleve.id" >

                                                
                                                    <form:option  value="${remarque.eleve.id}"><c:out value="${remarque.eleve.nom}"/></form:option>
                                                

                                            </form:select>


                                        </div>
                                    </div>
                               <div class="form-group">
                                    <label for="field-3" class="col-sm-3 control-label">Remarque</label>
                                        <div class="col-sm-5">
                                             <form:textarea class="form-control" rows="14" cols="70" path="rem"/>
                                    
                                </div>
                                

                                           


                                        </div>
                           
                                        <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Envoyer" class="btn btn-default" />
                                                <a href="<c:url value="/admin/eleves" />" class="btn btn-default">Cancel</a>
                                            </div>
                                    </form:form>
                                    
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