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
    <table cellpadding="0" cellspacing="0" border="0" class="table table-bordered">
        <thead>
            <tr>
                
           </tr>
       </thead>
        <tbody>
        <tr>
       
             <form:form action="${pageContext.request.contextPath}/ens/notes/Add"
                                               class="form-horizontal form-groups-bordered validate" commandName="ajoutNote"
                                               method="post">
                                               
                              <td>
                        <form:select path="idClasse" class="form-control">
                  
                              <option>select classe</option>
                                <c:forEach var="classe" items="${classes}">
                                                    <form:option  value="${classe.idClasse}"><c:out value="${classe.classeNom}"/></form:option>
                            </c:forEach>
                      </form:select>
                    </td>
                    <td>
                        <form:select path="idMatiere" class="form-control">
                                     <option>select matiere</option>
                           
                                <c:forEach var="matiere" items="${matieres}">
                                                    <form:option  value="${matiere.idMatiere}"><c:out value="${matiere.nom}"/></form:option>
                            </c:forEach>
                      </form:select>
                    </td>
                    <td>
                   
                           <form:select path="type" name="date" class="form-control">
                           
                                                         <option>select type de note</option>
                                                    <form:option  value="test"><c:out value="Test"/></form:option>
                                                    <form:option  value="devoir"><c:out value="devoir surveillé"/></form:option>
                                                    <form:option  value="examen"><c:out value="Examen"/></form:option>
                        
                      </form:select>
                      </td>
              
                    <td align="center"><input type="submit" value="Ajouter notes" class="btn btn-info"/></td>
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