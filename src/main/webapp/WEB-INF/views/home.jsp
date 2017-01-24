<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="stles.css">
   <link rel="stylesheet" href="<c:url value="/resources/assets/css/stles.css"/>">
   <script src="<c:url value="/resources/assets/js/jquery-2.2.3.js"/>"></script>
      <script src="<c:url value="/resources/assets/js/spt.js"/>"></script>
   
   
   <title>CSS MenuMaker</title>
</head>
<body>

<div id='cssmenu'>
<ul>
   <li><a href='#'><span>Home</span></a></li>
   <li class='active has-sub'><a href='#'><span>Products</span></a>
      <ul>
         <li class='has-sub'><a href='#'><span>Product 1</span></a>
            <ul>
               <li class="has-sub"><a href='#'><span>Sub Product</span></a></li>
               <li class='last'><a href='#'><span>Sub Product</span></a></li>
            </ul>
         </li>
         <li class='has-sub'><a href='#'><span>Product 2</span></a>
            <ul>
               <li><a href='#'><span>Sub Product</span></a></li>
               <li class='last'><a href='#'><span>Sub Product</span></a></li>
            </ul>
         </li>
      </ul>
   </li>
   <li><a href='#'><span>About</span></a></li>
   <li class='last'><a href='#'><span>Contact</span></a></li>
</ul>
</div>

</body>
<html>

