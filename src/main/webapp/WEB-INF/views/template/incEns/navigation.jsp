<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Sidebar -->
<!-- Sidebar -->
<div id="sidebar-wrapper">
<div id="cssmenu" class='tr'>

    <ul class="sidebar-nav ">
        <li class="sidebar-brand">
            <img src="<c:url value="/resources/uploads/logo.png"/>"  style="max-height:60px;"/>
        </li>


        <li>


<br/><br/><br/>
        </li>
        <li class="active has-sub">
            <a>Liste des eleves</a>
             <ul>
                 <c:forEach items="${classes}" var="classe">
                      <li class='last'>
                      <a href='<c:url value="/ens/eleves"><c:param name="id" value="${classe.idClasse}"/></c:url>' >
               <span> ${classe.classeNom}</span>
                  </a>
                    </li>
                  </c:forEach>
            </ul>
        </li>
        <li class='active has-sub'>
            <a href="#">

                <span>Les Exercice</span>
            </a>
             <ul>
                 <c:forEach items="${classes}" var="classe">
                      <li class='last'>
                      <a href='<c:url value="/ens/exercices"><c:param name="id" value="${classe.idClasse}"/></c:url>' >
               <span> ${classe.classeNom}</span>
                  </a>
                    </li>
                  </c:forEach>
            </ul>
        </li>
        <li class="last">
            <a href="<c:url value="/ens/matieres"/>"> Les  matieres enseignée</a>
           
        </li>

        <li>
            <a href="<c:url value="/ens/notes/ajouter"/>">Les notes</a>
            <!--   <ul>
                 <c:forEach items="${classes}" var="classe">
                      <li>
                      <a href='<c:url value="/ens/notes/Add"><c:param name="id" value="${classe.idClasse}"/></c:url>' >
                  <span> ${classe.classeNom}</span>
                  </a>
                    </li>
                  </c:forEach>
                   
                                            
            </ul>-->
        </li>
            <li class='active has-sub'>
            <a href="#">Absence</a>
                <ul>
                 <c:forEach items="${classes}" var="classe">
                      <li class='last'>
                      <a href='<c:url value="/ens/absence/eleves"><c:param name="id" value="${classe.idClasse}"/></c:url>' >
                  <span> ${classe.classeNom}</span>
                  </a>
                    </li>
                  </c:forEach>
                   
                                            
            </ul>
        </li>
  
        <li class='active has-sub'>
            <a href="#">Message</a>
            <ul>
              <li class='last'>
              <a href="#">Lire les messages</a>
              </li>
              <li class='last'>
              <a href="#"> Envouyer un message</a>
              </li>
            </ul>
        </li>
  
     

    </ul>
</div>
</div>
<!-- /#sidebar-wrapper -->
