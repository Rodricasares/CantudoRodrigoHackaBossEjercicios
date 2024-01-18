<%-- 
    Document   : index
    Created on : 11 ene 2024, 13:44:06
    Author     : rodri
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.dia3ejercicio1.logica.Controladora"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.dia3ejercicio1.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liga de baloncesto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

    </head>
    <body class=" bg-black"> 

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#"><img src="https://img.freepik.com/vector-gratis/plantilla-logotipo-baloncesto-degradado_23-2149373179.jpg" width="30" height="30" class="d-inline-block align-top m-1 rounded" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Liga <span class="sr-only"> de Baloncesto</span></a>
                    </li>

                </ul>
            </div>
        </nav>
        <div class="text-center"><h1 class="text-center text-light">Liga de Baloncesto Hack a Boss</h1><br><h2 class="text-center text-light">Equipos</h2></div>
        <!--Formulario Registro Equipo-->
        <div>

            <form  class="m-3 border border-ligh rounded p-3 " action="Servlet"  method="POST">


                <div class="form-group">
                    <h1 class=" text-light mt-3">Registrar Equipo</h1><br><br>
                    <label class="form-label text-light" for="nombre">Nombre del Equipo: </label>
                    <input class="text-dark" type="text" name="nombre" placeholder="Nombre" id="nombre"> 

                </div>  
                <button  class="btn btn-primary  mt-3" type="submit">Enviar Registrar Equipo</button>
            </form>
        </div>
        <!-- Boton listar Equipos -->
        <div>
            <form action="Servlet" method="GET"  class="m-3 border border-ligh rounded p-3">
                <h1 class=" text-light mt-3">Listar Equipos</h1><br><br>
                <button type="submit" class="btn btn-warning mt-3">Buscar Equipo...</button>

            </form> 
        </div>
     <!-- Eliminar equipo -->
            

       <div>

            <form  class="m-3 border border-ligh rounded p-3 " action="SvEliminarEquipo"  method="POST">


                <div class="form-group">
                    <h1 class=" text-light mt-3">Eliminar Equipo</h1><br><br>
                    <label class="form-label text-light" for="nombre">Id de Equipo a eliminar: </label>
                    <input class="text-dark" type="text" name="idEliminarEquipo" placeholder="id Equipo" id="idEliminarEquipo"> 

                </div>  
                <button  class="btn btn-danger  mt-3" type="submit">Eliminar Equipo</button>
            </form>
        </div>
     <!-- Editar equipo -->
            

       <div>

            <form  class="m-3 border border-ligh rounded p-3 " action="SvEditEquipo"  method="GET">


                <div class="form-group">
                    <h1 class=" text-light mt-3">Editar Equipo</h1><br><br>
                    <label class="form-label text-light" for="nombre">Id de Equipo a Editar: </label>
                    <input class="text-dark" type="text" name="idEquipoEditar" placeholder="id Equipo" id="idEquipoEditar"> 

                </div>  
                <button  class="btn btn-success  mt-3" type="submit">Editar Equipo</button>
            </form>
        </div>
     <!--Titulo h1 & h2 Partido-->
        
        <div class="text-center"><h1 class="text-center text-light">Liga de Baloncesto Hack a Boss</h1><br><h2 class="text-center text-light">Partidos</h2></div>

   
        <!--Registrar Partidos-->

        <div>
            <form  action="SvPartidos"  method="POST"  class="m-3 border border-ligh rounded p-3 ">


                <div class="form-group">
                    <h1 class=" text-light mt-3">Registrar Partidos</h1><br>
                    <label class="form-label text-light" for="fecha">Fecha partido: </label>
                    <input class="text-dark" type="date" name="fecha" placeholder="Fecha partido" id="fecha"> 
                    <br>
                    <label class="form-label text-light" for="puntosLocal">Puntos Local: </label>
                    <input class="text-dark" type="number" name="puntosLocal" placeholder="Puntuación Equ. Local" id="puntosLocal"> 


                    <label class="form-label text-light" for="puntosVisitante">Puntos Visitante: </label>
                    <input class="text-dark" type="number" name="puntosVisitante" placeholder="Puntuación Equ. Local" id="puntosVisitante"> 
                    <br>

                    <label class="form-label text-light" for="equipoLocal">Local:</label>
                    <select name="equipoLocal" id="equipoLocal">
                        <%
                            Controladora equipoNew = new Controladora();
                            List<Equipo> listequipo = equipoNew.listarEquipos();

                            for (Equipo equipo : listequipo) {
                        %>
                        <option value="<%=equipo.getId()%>"><%=equipo.getNombre()%></option>
                        <%
                            }
                        %>
                    </select>


                    <label class="form-label text-light" for="equipoVisitante">Visitante:</label>
                    <select name="equipoVisitante" id="equipoVisitante">
                        <%
                            for (Equipo equipo : listequipo) {
                        %>
                        <option value="<%=equipo.getId()%>"><%=equipo.getNombre()%></option>
                        <%
                            }
                        %>
                    </select>



                </div>  
                <button  class="btn btn-primary  mt-3" type="submit">Enviar Registrar Equipo</button>
            </form>
        </div>
       <!--Listar Partidos-->

        <div>
            <form action="SvPartidos" method="GET"  class="m-3 border border-ligh rounded p-3">
                <h1 class=" text-light mt-3">Listar Partidos</h1><br><br>
                <button type="submit" class="btn btn-danger  mt-3">Encuentros</button>

            </form> 
        </div>
     <!--Eliminar Partido-->

       <div>

            <form  class="m-3 border border-ligh rounded p-3 " action="SvEliminarPartido"  method="POST">


                <div class="form-group">
                    <h1 class=" text-light mt-3">Eliminar Partido</h1><br><br>
                    <label class="form-label text-light" for="nombre">Id de Partido a eliminar: </label>
                    <input class="text-dark" type="text" name="idEliminarPartido" placeholder="id Partido" id="idEliminarPartido"> 

                </div>  
                <button  class="btn btn-primary  mt-3" type="submit">Eliminar Partido</button>
            </form>
        </div>
    </body>
</html>
