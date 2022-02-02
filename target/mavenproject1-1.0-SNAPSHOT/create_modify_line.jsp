<%-- 
    Document   : add_station
    Created on : 25 janv. 2022, 13:56:33
    Author     : madesbouys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ICI C'EST POUR CRÉER OU MODIFIER DES LIGNES DE TRAIN</h1>
        
        <form action="SNCFServlet" method="POST" id="form" >
            
        </form>
        
        <button id="addButton" >AJOUTER UNE LIGNE</button>
        <script>
            const button = document.getElementById('addButton');
            button.addEventListener('click',function(){
                const input = document.createElement('input');
                const form = document.getElementById('form');
                input.setAttribute('name','station');
                form.appendChild(input);
            });
        </script>
    </body>
</html>
