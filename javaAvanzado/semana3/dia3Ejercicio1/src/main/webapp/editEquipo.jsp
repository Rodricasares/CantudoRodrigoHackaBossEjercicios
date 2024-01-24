<%-- 
    Document   : editEquipo
    Created on : 17 ene 2024, 18:40:25
    Author     : rodri
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.dia3ejercicio1.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liga de baloncesto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

        <style>
            #listarEquipos {
                width: 90%;
                margin: 0 auto; /* Esto centrará la tabla en el medio */
                border-collapse: collapse; /* Para evitar espacios entre las celdas */
                border: 1px solid black; /* Borde de la tabla */
            }
        </style>
    </head>     
    <body class=" bg-black ">
                <div>

      <%
                Equipo idEquipo = (Equipo)request.getSession().getAttribute("idEquipo"); 
            %>
            <form  class="m-3 border border-ligh rounded p-3 " action="SvEditEquipo"  method="POST">


                <div class="form-group">
                    <h1 class=" text-light mt-3">Editar Equipo</h1><br><br>
                    <label class="form-label text-light" for="nombre">Nombre del Equipo: </label>
                    <input class="text-dark" type="text" id="nombre"  name="nombre" placeholder="Editar nombre Equipo" value="<%=idEquipo.getNombre()%>"> 

                </div>  
                <button  class="btn btn-primary  mt-3" type="submit">Enviar Edición de Equipo</button>
            </form>
        </div>
        
       
    </body>
</html>
