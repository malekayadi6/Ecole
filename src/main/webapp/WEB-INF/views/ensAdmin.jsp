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
		<%@ include file="/WEB-INF/views/template/navigation.jsp"%>


		<!-- Page Content -->
		<div id="page-content-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<%@ include file="/WEB-INF/views/template/header.jsp"%>

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
								<h2>Ensiegnant ${enseignant.nom} ajouter avec succès</h2>
								
								
								<table class = "table table-hover">
                        <caption> </caption>

                        <thead>
                        <tr>
                            <th>cin</th>
                            <th>nom</th>
                            <th>prenom</th>
                            <th> dateDeNaissance</th>
                            <th>lieuNaissance</th>
                            <th>sex</th>
                            <th>telMobile</th>
                            <th>*action</th>
                        </tr>
 
                        </thead>

                        <tbody>
                       
                            <tr>

                                        <td>${cin}</td>
                            <td>${enseignant.nom}</td>
                            <td>${enseignant.prenom}</td>
                            <td> ${enseignant.dateDeNaissance}</td>
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
                        

                        </tbody>

                    </table>
								
								<hr />
								 <h2>choisir classe et matière pour l'enseignant ${enseignant.nom}</h2>
								<hr/>
    <table cellpadding="0" cellspacing="0" border="0" class="table table-bordered">
        <thead>
            <tr>
                
           </tr>
       </thead>
        <tbody>
        <tr>
       
             <form:form action="${pageContext.request.contextPath}/admin/enseignant/gestion"
                                               class="form-horizontal form-groups-bordered validate" commandName="form"
                                               method="post">
                                  <td>
                                   <form:select path="idEnsiegnant" class="form-control">
                             
                                                    <form:option  value="${enseignant.id}"><c:out value="${enseignant.nom}"/></form:option>
               
                      </form:select>
                                  </td>             
                              <td>
                        <form:select path="idClasse" class="form-control">
                              <option> select classe</option>
                           
                                <c:forEach var="classe" items="${classes}">
                                                    <form:option  value="${classe.idClasse}"><c:out value="${classe.classeNom}"/></form:option>
                            </c:forEach>
                      </form:select>
                    </td>
                    <td>
                        <form:select path="idMatiere" class="form-control">
                             <option>slecet matiere</option>
                           
                                <c:forEach var="matiere" items="${matieres}">
                                                    <form:option  value="${matiere.idMatiere}"><c:out value="${matiere.nom}"/></form:option>
                            </c:forEach>
                      </form:select>
                    </td>
               
              
                    <td align="center"><input type="submit" value="Envoyer" class="btn btn-info"/></td>
                </tr>
                
            </form:form>
            
            
            
        </tbody>
    </table>
    <br/>
    <br/>
<hr />
<br/>
<br/>

   
       
								
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