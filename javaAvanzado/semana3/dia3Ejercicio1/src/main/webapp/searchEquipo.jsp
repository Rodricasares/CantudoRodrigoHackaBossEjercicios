<%-- 
    Document   : searchEquipo
    Created on : 16 ene 2024, 11:49:51
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
    <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="index.jsp">
            <img src="https://img.freepik.com/vector-gratis/plantilla-logotipo-baloncesto-degradado_23-2149373179.jpg" width="30" height="30" class="d-inline-block align-top m-1 rounded" alt="">
            Liga Baloncesto - Equipos
        </a>
    </nav>

    <body class=" bg-black "> 


        <h1 class="text-light m-3">Listar Equipos</h1>

        <table id="listarEquipos" cellspacing="0" border="1" class="text-center" >
            <thead  >
                <tr>
                    <th class="text-light border border-ligh ">
                        Equipos
                    </th>
                       <th class="text-light border border-ligh ">
                        Eliminar/Editar
                    </th>

                    <th style="width: 210px"></th>
                </tr>
            </thead>

            <%
                List<Equipo> listEquipos = (List) request.getSession().getAttribute("listarEquipos");
            %>

            <tbody>
                <%for (Equipo team : listEquipos) {%>
                <tr>

                    <td class="text-light border border-ligh"><%=team.getNombre()%></td>
                    <td class="text-light border border-ligh text-center"> 
                        <form action="SvEliminarEquipo" method="POST">
                            <input type="hidden" name="idEliminarEquipo" value="<%=team.getId()%>">
                            <button type="submit" class="btn btn-danger m-2"><i class="bi bi-trash3"></i></button>
                        </form>
                    </td>
                                   </tr>
                <%}%> 
            </tbody>
            <%--
                        
                       <tfoot>
                <tr>
                    <th  class="text-light">
                        Equipo
                    </th>
               
                    <th style="width: 210px"></th>
                </tr>
            </tfoot>--%>
        </table>
    </body>
</html>
