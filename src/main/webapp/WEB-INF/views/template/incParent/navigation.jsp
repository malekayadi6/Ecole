<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Sidebar -->
<!-- Sidebar -->
<div id="sidebar-wrapper">
<div id="cssmenu">
    <ul class="sidebar-nav">
        <li class="sidebar-brand">
            <img src="<c:url value="/resources/uploads/logo.png"/>"  style="max-height:60px;"/>
        </li>


        <li>



        </li>
     <br/><br/><br/>
        <li>
            <a href="<c:url value="/parent/eleves"/>">

                <span>Info enfants</span>
            </a>
         
        </li>
        <li class='active has-sub'>
            <a href="#">Les exercices</a>
            <ul>
                 <c:forEach items="${eleves}" var="eleve">
                    <li class='last'>
                                          <a href='<c:url value="/parent/exercice"><c:param name="id" value="${eleve.id}"/></c:url>' >

                  Pour votre enfant<span> ${eleve.prenom}</span>
                  </a>
                    </li>
                  </c:forEach>
            </ul>
        </li>

        <li class='active has-sub'>
            <a href="#">Les notes</a>
             <ul>
                 <c:forEach items="${eleves}" var="eleve">
                      <li class='last'>
                      <a href='<c:url value="/parent/notes/eleve"><c:param name="id" value="${eleve.id}"/></c:url>' >
                  Pour votre enfant<span> ${eleve.prenom}</span>
                  </a>
                    </li>
                  </c:forEach>
                   
                                            
            </ul>
        </li>
         <li>
            <a href="#"> Les absences</a>
             <ul>
                 <c:forEach items="${eleves}" var="eleve">
                      <li>
                     <a href="<c:url value="/admin/student"/>"> 
                  Pour votre enfant<span> ${eleve.prenom}</span>
                  </a>
                    </li>
                  </c:forEach>
            </ul>
        </li>
        <li>
            <a href="<c:url value="/parent/messages"/>"> Message</a>
           
        </li>
        <li class='active has-sub'>
            <a href="#">Remarques</a>
             <ul>
                 <c:forEach items="${eleves}" var="eleve">
                       <li class='last'>
                      <a href='<c:url value="/parent/remarques"><c:param name="id" value="${eleve.id}"/></c:url>' >
                  Pour votre enfant<span> ${eleve.prenom}</span>
                  </a>
                    </li>
                  </c:forEach>
                  
            </ul>
        </li>
    

    </ul>
</div>
</div>
<!-- /#sidebar-wrapper -->
