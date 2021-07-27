<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Agregar Usuario</title>
    </head>
    <body>
        <c:if test="${addUserSuccess}">
            <div>Usuario Agregado ID: ${savedUser.id}</div>
        </c:if>

        <c:url var="add_user_url" value="/usuario/agregarUsuario"/>
        <form:form action="${add_user_url}" method="post" modelAttribute="usuario">
            <form:label path="id">ID: </form:label> <form:input type="text" path="id"/>
            <form:label path="nombre">Nombre: </form:label> <form:input type="text" path="nombre"/>
            <form:label path="contrasena">Password: </form:label> <form:input path="contrasena"/>
            <input type="submit" value="submit"/>
        </form:form>
    </body>
</html>