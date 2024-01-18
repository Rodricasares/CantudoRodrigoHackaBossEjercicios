<%-- 
    Document   : searchPartido
    Created on : 16 ene 2024, 14:07:43
    Author     : rodri
--%>

<%@page import="com.mycompany.dia3ejercicio1.logica.Partido"%>
<%@page import="java.util.List"%>
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
            Liga Baloncesto - Partidos
        </a>
    </nav>

    <body class=" bg-black "> 


        <h1 class="text-light m-3">Listar Partidos</h1>

        <table id="listarEquipos" cellspacing="0" border="1" class="text-center" >
            <thead  >
                <tr>
                    <th class="text-light border border-ligh ">
                        Encuentro
                    </th>
                    <th class="text-light border border-ligh ">
                        Equipo Local
                    </th>
                    <th class="text-light border border-ligh ">
                        Equipo Visitante
                    </th>
                    <th class="text-light border border-ligh ">
                        Puntuación Equ.Local
                    </th>
                       <th class="text-light border border-ligh ">
                        Puntuación Equ.Visitante
                    </th>
                     <th class="text-light border border-ligh ">
                        Día de partido
                    </th>
                      <th class="text-light border border-ligh ">
                        Eliminar /editar
                    </th>
                    <th sty
                    <th style="width: 210px"></th>
                </tr>
            </thead>
            <%
                List<Partido> listPartidos = (List<Partido>) request.getSession().getAttribute("listarPartidos");%>

            <%    for (Partido match : listPartidos) {%>

            <tr>
                <td class="text-light border border-ligh"><%= match.getId()%></td>
                <td class="text-light border border-ligh"><%= match.getLocal()%></td>
                <td class="text-light border border-ligh"><%= match.getVisitante()%></td>
                <td class="text-light border border-ligh"><%= match.getPuntuacionLocal()%></td>
                <td class="text-light border border-ligh"><%= match.getPuntuacionVisitante()%></td>
                <td class="text-light border border-ligh"><%= match.getFecha()%></td>
                <td class="text-light border border-ligh text-center"  <td class="text-light border border-ligh text-center"> 
                        <form action="SvEliminarPartido" method="POST">
                            <input type="hidden" name="idEliminarPartido" value="<%=match.getId()%>">
                            <button type="submit" class="btn btn-danger m-2"><i class="bi bi-trash3"></i></button>
                        </form>
                    </td></td>
            </tr>
            <%
                }

            %>
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
