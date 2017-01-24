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
					class="entypo-menu"></i> malek </a></li>
			<li><a href="#add" data-toggle="tab"><i
					class="entypo-plus-circled"></i> malek </a></li>
		</ul>
		<!------CONTROL TABS END------>
		<div class="tab-content">
			<!----TABLE LISTING STARTS-->
			<div class="tab-pane box active" id="list">

				<table class="table table-bordered datatable" id="table_export">
					<thead>
						<tr>
							<th><div>Matiere</div></th>
							<th><div>sujet exercice </div></th>
							<th><div> date depot</div></th>
							<th><div>options</div></th>
						</tr>
					</thead>
					<tbody>
						<!-- ?php $count = 1;foreach($subjects as $row):?> -->
						<tr>
							<td>td</td>
							<td>td</td>
							<td>td</td>
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
										<li><a href="#"
											onclick="showAjaxModal('<?php echo base_url();?>index.php?modal/popup/modal_edit_subject/<?php echo $row['subject_id'];?>');">
												<i class="entypo-pencil"></i> f
										</a></li>
										<li class="divider"></li>

										<!-- DELETION LINK -->
										<li><a href="#"
											onclick="confirm_modal('<?php echo base_url();?>index.php?teacher/subject/delete/<?php echo $row['subject_id'];?>/<?php echo $class_id;?>');">
												<i class="entypo-trash"></i> ff
										</a></li>
									</ul>
								</div>
							</td>
						</tr>

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