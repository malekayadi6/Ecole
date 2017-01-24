<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content="Neon Admin Panel"/>
    <meta name="author" content=""/>

    <title>login | School</title>


    <link rel="stylesheet" href="<c:url value="/resources/assets/css/font-icons/entypo/css/entypo.css"/>">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic">
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/bootstrap.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/neon-core.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/neon-theme.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/neon-forms.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/custom.css"/>">
    <link rel="shortcut icon" href="<c:url value="/resources/assets/images/favicon.png"/>">

</head>
<body class="page-body login-page login-form-fall" data-url="http://neon.dev">

<div class="login-container">

    <div class="login-header login-caret">

        <div class="login-content" style="width:100%;">


            <img src="<c:url value="/resources/uploads/logo.png"/>" height="60" alt=""/>


            <p class="description">

            <h2 style="color:#cacaca; font-weight:100;">
                System de Gestion d'une école primaire </h2>
            </p>


        </div>

    </div>


    <div class="container">

        <div class="form-signin">

            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <div class="form-login-error">
                <h3>Invalid login</h3>

                <p>Please enter correct email and password!</p>
            </div>

            <c:if test="${not empty error}">
                <div class="error" style="color: red">${error}</div>
            </c:if>

            <form name="loginForm" action="<c:url value="/j_spring_security_check"/>" method="post">

                <div class="form-group">
                    <label for="username">User :</label>
                    <input type="text" id="username" name="username" class="form-control"/>
                </div>

                <div class="form-group">
                    <label for="password">User :</label>
                    <input type="password" id="password" name="password" class="form-control"/>
                </div>

                <input type="submit" value="Submit" class="btn btn-default">
                <input type="hidden"
                       name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>
            </form>


        </div>

    </div>

</div>


</body>
</html>