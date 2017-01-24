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





                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-primary" data-collapsed="0">
                                <div class="panel-heading">
                                    <div class="panel-title">
                                        <i class="entypo-plus-circled"></i>
                                        Edit Student
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <form:form action="${pageContext.request.contextPath}/admin/student/edit/${student.id}"
                                               class="form-horizontal form-groups-bordered validate" commandName="student"
                                               method="post">

                                        <form:hidden path="id" value="${student.id}" />

                                        <div class="form-group">
                                            <label for="field-1" class="col-sm-3 control-label">Name</label>
                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="studentName" value="${student.studentName}"/>

                                            </div>

                                        </div>

                                        <div class="form-group">
                                            <label for="field-2" class="col-sm-3 control-label">Sex</label>

                                            <div class="col-sm-5">



                                                <form:select name="class_id" class="form-control"  id="class_id" path="studentSex"  >
                                                    <option value="Male" label="Select" ${student.studentSex == "Male" ? 'selected' : ''} >Male  </option>
                                                    <option value="Female" label="Select" ${student.studentSex == "Female" ? 'selected' : ''} >Female </option>
                                                </form:select>

                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="field-3" class="col-sm-3 control-label">Parent</label>

                                            <div class="col-sm-5">

                                                <form:select name="class_id" class="form-control"  id="class_id" path="parentStudent.parentId"  >

                                                    <c:forEach var="parent" items="${parents}">
                                                        <option  value="${parent.parentId}" ${student.parentStudent.parentId == parent.parentId ? 'selected' : ''}><c:out value="${parent.parentName}"/></option>
                                                    </c:forEach>

                                                </form:select>


                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label for="field-4" class="col-sm-3 control-label">Birthday</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="studentBirthday" value="${student.studentBirthday}" />


                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="field-2" class="col-sm-3 control-label">Class</label>

                                            <div class="col-sm-5">
                                                <form:input type="text" class="form-control" path="studentClass" value="${student.studentClass}"/>


                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="col-sm-offset-3 col-sm-5">
                                                <input type="submit" value="Edit Student" class="btn btn-default" />
                                                <a href="<c:url value="/admin/student" />" class="btn btn-default">Cancel</a>
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