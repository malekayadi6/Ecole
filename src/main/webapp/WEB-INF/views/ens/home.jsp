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
				<div class="col-lg-12">
					<%@ include file="/WEB-INF/views/template/incEns/header.jsp"%>
					<h1>Hello world!</h1>

				<button type="button" class="btn btn-success">Lire Les message</button>
				<button type="button" class="btn btn-success">Envoyer un message</button>
				
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
