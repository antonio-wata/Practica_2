<%-- 
    Document   : registro_completo
    Created on : 25-feb-2017, 17:43:51
    Author     : Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Completo</title>
    </head>
    <body>
        <h1>Se registro a:</h1>
        <form action="." oninput="range_control_value.value = range_control.valueAsNumber">
        <h2><br>${nombre1}
            <br>${carrera1}
            <br>${email1}
            <br>${password1}
            </form>
        </h2>
    </body>
</html>
