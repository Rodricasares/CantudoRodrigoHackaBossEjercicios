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
@WebServlet(name = "SVEditarEquipo", urlPatterns = {"/SVEditarEquipo"})
public class SVEditarEquipo extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idEditar = Integer.parseInt(request.getParameter("idEquipoEditar"));
        Equipo idEquipo = control.obtenerEquipo(idEditar);
        System.out.println(idEditar);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("idEquipo", idEquipo);
        System.out.println(idEditar);
        
        response.sendRedirect("editEquipo.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String equipoEdit = request.getParameter("nombre");

        System.out.println("doPost Editar Equipo \n");
        System.out.println("Eqiopo: " + equipoEdit);
        System.out.println("--------------------------------------------------");
        System.out.println("atributo guardado: " + ((Equipo) request.getSession().getAttribute("equipo")).toString());

        control.editarEquipo(equipoEdit, (Equipo) request.getSession().getAttribute("equipo"));

        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
