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
        <title>Créer ou modifier des lignes de train</title>
    </head>
    <body>
        <h1>Créer ou modifier des lignes de train</h1>
            <h3>Liste des stations de train</h3>
            <ul>
                <% for(int i = 0; i < 3 ; i++) { %>
                    <li><div><p>Train Paris Nord</p><button>modifier</button></div></li>
                <% } %>
            </ul>

            <h3>Créer une ligne</h3>
            <div>
                <form action="SNCFServlet" method="POST">
                    <label form="station">Choisissez vos stations</label>
                    <select name="station" id="station" multiple>
                    <% for(int i=0; i < 3 ; i++) { %>
                        <% out.println("<option value='station'>Station" + i + "</option>"); %>                  
                    <% } %>
                    </select>
                    <button id="submit" type="submit">Créer</button>
                </form>
            </div>
    </body>
</html>
