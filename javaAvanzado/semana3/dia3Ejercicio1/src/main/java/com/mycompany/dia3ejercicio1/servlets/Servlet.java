
package com.mycompany.dia3ejercicio1.servlets;

import com.mycompany.dia3ejercicio1.logica.Controladora;
import com.mycompany.dia3ejercicio1.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    //ArrayList<Equipo> listEquipos = new ArrayList<>();
    Controladora cntSvEquipo = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Equipo> listarEquipos = cntSvEquipo.listarEquipos();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listarEquipos", listarEquipos);

        //Redireccionar 
        System.out.println(listarEquipos);
        System.out.println("doGet lista equipos");
        response.sendRedirect("searchEquipo.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String equipoNew = request.getParameter("nombre");

      
        System.out.println("doPost \n" );
        System.out.println("Eqiopo: " + equipoNew);
  
        cntSvEquipo.createEquipo(equipoNew);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
