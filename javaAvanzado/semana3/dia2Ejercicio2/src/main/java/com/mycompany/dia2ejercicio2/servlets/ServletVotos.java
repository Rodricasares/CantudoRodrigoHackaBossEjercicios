package com.mycompany.dia2ejercicio2.servlets;

import com.mycompany.dia2ejercicio2.logica.Controladora;
import com.mycompany.dia2ejercicio2.logica.Votos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletVotos", urlPatterns = {"/ServletVotos"})
public class ServletVotos extends HttpServlet {
    
   // ArrayList<Votos> listOfVotos = new ArrayList<>();
    Controladora control = new Controladora();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Votos> votosPartidos = control.listOfVotes();

        Map<String, Long> cuentaVotosOrdenados = votosPartidos.stream()
            .collect(Collectors.groupingBy(Votos::getPartido, TreeMap::new, Collectors.counting()));
        

        request.setAttribute("resultados", cuentaVotosOrdenados);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Votos voto = new Votos();

        String partidoSeleccionado = request.getParameter("partido");

        voto.setPartido(partidoSeleccionado);

        control.createVote(voto);
        response.sendRedirect("index.jsp");

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
