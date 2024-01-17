/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.dia3ejercicio1.servlets;

import com.mycompany.dia3ejercicio1.logica.Controladora;
import com.mycompany.dia3ejercicio1.logica.Equipo;
import com.mycompany.dia3ejercicio1.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rodri
 */
@WebServlet(name = "SvPartidos", urlPatterns = {"/SvPartidos"})
public class SvPartidos extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Partido> listarPartido = control.listarPartidos();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listarPartidos", listarPartido);

        //Redireccionar 
        System.out.println(listarPartido);
        response.sendRedirect("searchPartido.jsp");
        System.out.println("doGet listar partidos");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int idEquipoLocal = Integer.parseInt(request.getParameter("equipoLocal"));
        int idEquipoVisitante = Integer.parseInt(request.getParameter("equipoVisitante"));
        LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));
        int puntoLocal = Integer.parseInt(request.getParameter("puntosLocal"));
        int puntoVisitante = Integer.parseInt(request.getParameter("puntosVisitante"));
      
       
        Equipo local = control.obtenerEquipo(idEquipoLocal);
        Equipo visitante = control.obtenerEquipo(idEquipoVisitante);
         //crear partido
        control.createPartido( fecha, puntoLocal, puntoVisitante, local, visitante);

        //Redirección
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
