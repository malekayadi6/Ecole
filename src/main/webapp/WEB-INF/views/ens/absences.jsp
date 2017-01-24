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
									class="entypo-plus-circled"></i>Ajouter les absences </a></li>


						</ul>
						<!------CONTROL TABS END------>
						<div class="tab-content">
							<!----TABLE LISTING STARTS-->
							<div class="tab-pane box active" id="list">

								<div class="panel-body">
								
								
								<hr />
								
								
								
             <form:form action="${pageContext.request.contextPath}/ens/notes/Add"
                                               class="form-horizontal form-groups-bordered validate" commandName="absences"
                                               method="post">
    <table class="table table-bordered">
        <thead>
           <tr>  
                <td> Matiere</td>
                <td> Date de cours</td>
                <td>  heure de cours<td>
          
               
               
        </tr>
       </thead>
        <tbody>
        <tr>
       
                
                    <td>
                        <form:select path="idMatiere" class="form-control">
                                     <option>select matiere</option>
                           
                                <c:forEach var="matiere" items="${matieres}">
                                                    <form:option  value="${matiere.idMatiere}"><c:out value="${matiere.nom}"/></form:option>
                            </c:forEach>
                      </form:select>
                    </td> 
                   
                    <td>                    
                                     
                    
                        <form:input  type="date" class="form-control" path="date"/>
                    
                        </td>
                       
                      <td>
                        <form:input  type="time" path="debutCour" class="form-control"/>
                      </td> 
                      <td></td>  
      
              
                </tr>
                
           
            
            
            
        </tbody>
    </table>
    
    
    
    
    
    
      <table cellpadding="0" cellspacing="0" border="0" class="table table-bordered">
 
						 <thead>
            <tr>
        
                <th>Nom</th>
                <th>Prenom</th>              
               
                <th>Absence<th>
           </tr>
       </thead>
       <tbody>
       <c:forEach items="${absences.absenceEleves}" var="absenceEleves" varStatus="status">
       <tr> 
               
                         <td> ${absenceEleves.eleve.nom}</td>
                 
                       <td>${absenceEleves.eleve.prenom}</td>
                       <td> 
                                                                   <div class="col-sm-5">
                       
                         <form:select path="absenceEleves[${status.index }].absence"  class="form-control">
                                                              <option>select présence</option>
                         
                         <form:option value="true" label="present"/>
                         <form:option value="true" label="absent"/>
                         </form:select>
                         </div>
                         
                       
                       </td>
                      
           
        
        
       </tr>
                </c:forEach>
      
    
       </tbody>		
       </table>
                           <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Envoyer" class="btn btn-info" />
                                                <a href="<c:url value="/admin/eleves" />" class="btn btn-info">Annuler</a>
                                            </div>
                                            </div>
     
    
    
    
    
    
    
     </form:form>
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




















