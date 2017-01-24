<%--
  Created by IntelliJ IDEA.
  User: Mahdi
  Date: 3/26/2016
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
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
                      Gérer les eleves         </h3>


                    <a href="<c:url value="/admin/classes"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        Liste des eleves
                    </a>
                    <br><br>


                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-primary" data-collapsed="0">
                                <div class="panel-heading">
                                    <div class="panel-title" >
                                        <i class="entypo-plus-circled"></i>
                                       Ajouter eleve
                                    </div>
                                </div>
                                <div class="panel-body">

                                    <form:form action="${pageContext.request.contextPath}/admin/eleve/add"
                                               class="form-horizontal form-groups-bordered validate" commandName="eleve"
                                               method="post">
                                    <div class="form-group">
                                        <label for="field-1" class="col-sm-3 control-label">Nom</label>
                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="nom"/>

                                        </div>

                                    </div>
                                       <div class="form-group">
                                        <label for="field-1" class="col-sm-3 control-label">Prenom</label>
                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="prenom"/>

                                        </div>

                                    </div>

                                    <div class="form-group">
                                        <label for="field-2" class="col-sm-3 control-label">Sex</label>

                                        <div class="col-sm-5">



                                            <form:select name="class_id" class="form-control"  id="class_id" path="sex" >

                                                <form:option value="Homme" label="Select" >Homme </form:option>
                                                <form:option value="Femme" label="Select" >Femme </form:option>

                                            </form:select>

                                         </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="field-3" class="col-sm-3 control-label">Parent</label>

                                        <div class="col-sm-5">

                                            <form:select name="class_id" class="form-control"  id="class_id" path="eleveParent.id" >

                                                <option value="" label="Select" >Select parent </option>

                                                <c:forEach var="parent" items="${parents}">
                                                    <form:option  value="${parent.id}"><c:out value="${parent.nom}"/></form:option>
                                                </c:forEach>

                                            </form:select>


                                        </div>
                                    </div>
 

                                        <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Date de naissance</label>

                                            <div class="col-sm-5">
                                                <form:input type="Date" class="form-control" path="dateDeNaissance" />


                                            </div>
                                        </div>
                                          <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Lieu de naissance</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="lieuNaissance" />


                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="field-2" class="col-sm-3 control-label">Classe</label>

                                            <div class="col-sm-5">
                                                                 <form:select name="class_id" class="form-control"  id="class_id" path="classse.idClasse">
                                                                     <option value="" label="Select" >Select classe </option>
                                                            <c:forEach var="classe" items="${classes}">
                                                              <form:option  value="${classe.idClasse}"><c:out value="${classe.classeNom}"/></form:option>
                                                              </c:forEach>

                                                           </form:select>


                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Ajouter" class="btn btn-default" />
                                                <a href="<c:url value="/admin/eleves" />" class="btn btn-default">Annuler</a>
                                            </div>



                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>








                    <%@ include file="/WEB-INF/views/template/footer.jsp" %>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->



</body>



</html>