<%-- 
    Document   : inicio
    Created on : 20/02/2017, 11:08:36 PM
    Author     : jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        
        <style type="text/css">
        html, body{ height: 100%; margin: 0; padding: 0;}
        #map {height: 100%; margin-left: 25%; margin-right: 25%; margin-top: 2%; margin-bottom: 2% }
        </style>
        
    </head>
    <body>
        <form method="POST" action="/Practica_2/persona2">
            <h1>Iniciar Sesion</h1>
            <input id="nombre2" name="nombre2" type="text" placeholder="Correo">
            <br>
            <input id="nombre2" name="nombre3" type="text" placeholder="Contrasena">
            <br>
            <button>Aceptar</button>
        </form>
        <form method="submit" action="/Practica_2/registro1">
            <button>Registrarse</button>
        </form>
        
        <div id = "map"></div>
        
        <script type="text/javascript">
            var map;
            function initMap(){
                map = new google.maps.Map(document.getElementById('map'), {
                    center: {lat: 35.141432, lng: -90.052629},
                    zoom: 21,
                    mapTypeId: google.maps.MapTypeId.SATELLITE
                });
                
                var mensaje = 'come down and play';
                
                var informacion =  new google.maps.InfoWindow({
                    content: mensaje
                });
                
                var marca = new google.maps.Marker({
                    position: {lat: 35.141432, lng: -90.052629},
                    map: map,
                    title: 'Prueba'
                });
                marca.addListener('click', function() {
                        informacion.open(map, marca);
                });
                
                
                informacion.open(map, marca);
                
                
            }
        </script>
        
        <script type="text/javascript"
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD4zlTyZaJv7glTJdyFeuLITheGviaSZts&sensor=false&callback=initMap">
        </script>
        
    </body>
</html>
