<%-- 
    Document   : registro
    Created on : 25-feb-2017, 17:04:43
    Author     : Antonio
--%>

<%@ page import="java.util.Calendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form method="submit" action="/Practica_2/persona1?">
            <input id="name" name="nombre1" type="text" placeholder="Nombre"/>
            <br>
            <input id="carrera" name="carrera1" type="text" placeholder="Carrera"/>
            <br>
            <input id="email" name="email1" type="text" placeholder="Correo"/>
            <br>
            <input id="password" name="password1" type="text" placeholder="Contrasena"/>
            <br>
            <button>Aceptar</button>
        </form>
    </body>
</html>
