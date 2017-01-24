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
					<div class="col-md-12">
						<%@ include file="/WEB-INF/views/template/incEns/header.jsp"%>

						<!------CONTROL TABS START------>
						<ul class="nav nav-tabs bordered">
							<li class="active"><a href="#list" data-toggle="tab"><i
									class="entypo-plus-circled"></i>Ajouter notes </a></li>


						</ul>
						<!------CONTROL TABS END------>
						<div class="tab-content">
							<!----TABLE LISTING STARTS-->
							<div class="tab-pane box active" id="list">

								<div class="panel-body">
								
								
								<hr />
 
    <br/>
    <br/>


    
                    <form:form action="${pageContext.request.contextPath}/ens/note/Add"
                                               class="form-horizontal form-groups-bordered validate" modelAttribute="formNote"
                                               method="post">
                                              
    <table cellpadding="0" cellspacing="0" border="0" class="table table-bordered">
 
						 <thead>
            <tr>
         
                <th>Nom</th>
                <th>Prenom</th>
                <th>Matiere</th>
                <th>Type note</th>
                <th>Note<th>
           </tr>
       </thead>
       <tbody>
       <c:forEach items="${formNote.notes}" var="note" varStatus="status">
       <tr> 
                         <td> ${note.eleve.nom}</td>
                 
                <td>${note.eleve.prenom}</td>
                                  <td>${note.matiere.nom}</td>
                <td>${note.type}</td>
                <td><input name="notes[${status.index }].note" value="${note.note}" /></td>
        
        
       </tr>
                </c:forEach>
      
    
       </tbody>		
       </table>
         <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Envoyer" class="btn btn-default" />
                                                <a href="<c:url value="/admin/eleves" />" class="btn btn-default">Cancel</a>
                                            </div>
                                            </div>
          </form:form>
								
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>