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

                    <br><br>
			
                            <div class="panel panel-primary" data-collapsed="0">
                                <div class="panel-heading">
                                    <div class="panel-title" >
                                        <i class="entypo-plus-circled"></i>
                                        Addmission Form
                                    </div>
                                </div>
                                <div class="panel-body">
                                        <h3 id="s" style="color:green;"> ${msg}</h3>
                                    <form:form action="${pageContext.request.contextPath}/ens/exercice/add"
                                               class="form-horizontal form-groups-bordered validate" commandName="exercice"
                                               method="post">
                          

                                    <div class="form-group">
                                        <label for="field-3" class="col-sm-3 control-label">Classe</label>

                                        <div class="col-sm-5">

                                            <form:select name="class_id" class="form-control"  id="class_id" path="classe.idClasse" >

                                                <option value="" label="Select" >Select Classe </option>

                                                <c:forEach var="classe" items="${classes}">
                                                    <form:option  value="${classe.idClasse}"><c:out value="${classe.classeNom}"/></form:option>
                                                </c:forEach>

                                            </form:select>


                                        </div>
                                    </div>
                                  <div class="form-group">
                                        <label for="field-3" class="col-sm-3 control-label">Matiere</label>

                                        <div class="col-sm-5">

                                            <form:select name="class_id" class="form-control"  id="class_id" path="matiere.idMatiere" >

                                                <option value="" label="Select" >Select Matiere </option>

                                                <c:forEach var="matiere" items="${matieres}">
                                                    <form:option  value="${matiere.idMatiere}"><c:out value="${matiere.nom}"/></form:option>
                                                </c:forEach>

                                            </form:select>


                                        </div>
                                    </div>
                                   


                                        <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">sujet</label>

                                            <div class="col-sm-5">
                                                <form:textarea class="form-control" path="sujet" rows="10" cols="30" />


                                            </div>
                                        </div>

                                                                   <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Date depot</label>

                                            <div class="col-sm-5">
                                                <form:input type="date" class="form-control" path="date" />


                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Ajouter" class="btn btn-default" />
                                                <a href="<c:url value="/admin/eleves" />" class="btn btn-default">Cancel</a>
                                            </div>



                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
									

						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
