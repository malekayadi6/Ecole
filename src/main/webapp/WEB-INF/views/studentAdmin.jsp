<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


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
                        Gérer les eleves          </h3>
                    <hr>


                    <a href="<c:url value="/admin/eleve/add"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        Ajouter eleve
                    </a>
                    <br/><br/><br/>
                    <hr/>

                    <table class = "table table-hover">
                        <caption> </caption>

                        <thead>
                        <tr>
                           
                            <th>Name</th>
                            <th>Prenom</th>
                              <th>Sex</th>
                            <th>Parent</th>
                            <th>Date de naissance</th>
                            <th>Lieu de naissance</th>
                          
                           
                            <th>Classe</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${eleves}" var="eleve" >
                        <tr>

                         
                            <td>${eleve.nom}</td>
                             <td>${eleve.prenom}</td>
                              <td>${eleve.sex}</td>
                             <td>${eleve.eleveParent.prenom}</td>
                              <td>${eleve.dateDeNaissance}</td>
                               <td>${eleve.lieuNaissance}</td>
                                
                                	   <td>${eleve.classse.classeNom}</td>
	
	
                                
                            
                            
                            <td></td>
                         
                        </tr>
                        </c:forEach>

                        </tbody>

                    </table>

                    <%@ include file="/WEB-INF/views/template/footer.jsp" %>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>

</body>



</html>