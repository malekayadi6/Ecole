
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    Gérer les parents         </h3>


                    <a href="<c:url value="/admin/parents"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        liste des parents
                    </a>
                    <br><br>


                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-primary" data-collapsed="0">
                                <div class="panel-heading">
                                    <div class="panel-title">
                                        <i class="entypo-plus-circled"></i>
                                       Ajouter parent
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <form:form action="${pageContext.request.contextPath}/admin/parent/add"
                                               class="form-horizontal form-groups-bordered validate" commandName="parent"
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
                                            <form:input type="text" class="form-control"
                                                   value=""  path="prenom"/><form:errors path="prenom" cssStyle="color: red" />
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
                                        <label for="field-2" class="col-sm-3 control-label">CIN</label>

                                        <div class="col-sm-5">
                                            <form:input type="cin" class="form-control" path="cin" value="" />
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="field-2" class="col-sm-3 control-label">tel Mobile</label>

                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="telMobile"  value="" />
                                        </div>
                                    </div>
             

                                    <div class="form-group">
                                        <label for="field-2" class="col-sm-3 control-label">Date de naissance</label>

                                        <div class="col-sm-5">
                                            <form:input type="date" class="form-control" path="dateDeNaissance" value="" />
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="field-2" class="col-sm-3 control-label">Lieu de naissance</label>

                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="lieuNaissance" value=""/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="field-2" class="col-sm-3 control-label">Fonction</label>

                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="fonction" value=""/>
                                        </div>
                                    </div>
                                    
                                      <hr/>
                                         <h3>Adresse</h3>
                                         <hr/>
                                           <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Pays</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="adresse.pays" />
                                            </div>
                                            </div>
                                              <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Ville</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="adresse.ville" />
                                            </div>
                                            </div>
                                              <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Rue</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="adresse.adress" />
                                            </div>
                                            </div>
                                               <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Code Postale</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="adresse.codePostale" />
                                            </div>
                                            </div>

                                    <div class="form-group">
                                        <div class="col-sm-offset-3 col-sm-5">
                                            <input type="submit" value="Ajouter" class="btn btn-default" />
                                            <a href="<c:url value="/admin/parent" />" class="btn btn-default">Annuler</a>
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

                    <script type="text/javascript">

                        function get_class_sections(class_id) {

                            $.ajax({
                                url: '<?php echo base_url();?>index.php?admin/get_class_section/' + class_id ,
                                success: function(response)
                                {
                                    jQuery('#section_selector_holder').html(response);
                                }
                            });

                        }

                    </script>






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