<%--
  Created by IntelliJ IDEA.
  User: Mahdi
  Date: 3/26/2016
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
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
                        Ajouter matieres         </h3>


                    <a href="<c:url value="/admin/matieres"/>"
                       class="btn btn-primary pull-right">
                        <i class="entypo-plus-circled"></i>
                        liste des matieres
                    </a>
                    <br><br>


                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-primary" data-collapsed="0">
                                <div class="panel-heading">
                                    <div class="panel-title">
                                        <i class="entypo-plus-circled"></i>
                                       Ajouter matiere
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <form:form action="${pageContext.request.contextPath}/admin/matiere/add"
                                               class="form-horizontal form-groups-bordered validate" commandName="matiere"
                                               method="post">


                                    <div class="form-group">

                                        <label for="field-1" class="col-sm-3 control-label">nom matiere</label>
                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="nom"/>

                                        </div>
                                    </div>
                                     <div class="form-group">

                                        <label for="field-1" class="col-sm-3 control-label">coef</label>
                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="coef"/>

                                        </div>
                                    </div>
                                       <div class="form-group">

                                        <label for="field-1" class="col-sm-3 control-label">designation</label>
                                        <div class="col-sm-5">
                                            <form:input type="text" class="form-control" path="designation"/>

                                        </div>
                                    </div>

                               
             

                                    <div class="form-group">
                                        <div class="col-sm-offset-3 col-sm-5">
                                            <input type="submit" value="Ajouter" class="btn btn-default" />
                                            <a href="<c:url value="/admin/matieres" />" class="btn btn-default">Annuler</a>
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