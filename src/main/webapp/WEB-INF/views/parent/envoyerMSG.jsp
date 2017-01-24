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
	<%@ include file="/WEB-INF/views/template/incParent/navigation.jsp"%>


	<!-- Page Content -->
	<div id="page-content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<%@ include file="/WEB-INF/views/template/incParent/header.jsp"%>
				  <div class="col-md-12">
                            <div class="panel panel-primary" data-collapsed="0">
                                <div class="panel-heading">
                                    <div class="panel-title" >
                                        <i class="entypo-plus-circled"></i>
                                        Envoyer Message
                                    </div>
                                </div>
                                <div class="panel-body">

                                    <form:form action="${pageContext.request.contextPath}/parent/envoyermsg"
                                               class="form-horizontal form-groups-bordered validate" commandName="message"
                                               method="post">
                                    <div class="form-group">
                                        <label for="field-1" class="col-sm-3 control-label">Ensiegnant</label>
                                        <div class="col-sm-5">
                                            <form:select name="class_id" class="form-control"  id="class_id" path="ens.id">

                                                <option value="" label="Select" >Select Ensiegnant </option>

                                                <c:forEach var="enseignant" items="${enseignants}">
                                                    <form:option  value="${enseignant.id}"><c:out value="${enseignant.nom}"/></form:option>
                                                </c:forEach>

                                            </form:select>

                                        </div>

                                    </div>

                                   

                                  

                                        <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Objet</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="objet" />


                                            </div>
                                        </div>
                                        

                                        <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Ecrire Message</label>

                                            <div class="col-sm-5">
                                               
                                                <form:textarea class="form-control" path="msg" rows="10" cols="60" />

                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Envoyer" class="btn btn-default" />
                                                <a href="<c:url value="/parent" />" class="btn btn-default">Cancel</a>
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
