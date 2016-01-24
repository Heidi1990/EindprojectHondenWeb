/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import bll.Klant;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Heidi
 */
public class Login extends HttpServlet {

    private EntityManagerFactory emf;
    private EntityManager em;
    private Klant klant;
    private String error;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                emf = Persistence.createEntityManagerFactory("EindprojectHondenWebPU");
                em = emf.createEntityManager();
                em.getTransaction().begin();
                Query q = em.createNamedQuery("Klant.findByEmail").setParameter("email", request.getParameter("email"));
                try {
                    klant = (Klant) q.getSingleResult();
                    if (klant.getWachtwoord().equals(request.getParameter("wachtwoord"))) {
                        request.getSession().setAttribute("AangemeldeGebruiker", klant);
                        RequestDispatcher rs = request.getRequestDispatcher("Index.jsp");
                        rs.forward(request, response);
                    } else {
                        request.setAttribute("error", "fout wachtwoord");
                        RequestDispatcher rs = request.getRequestDispatcher("Login.jsp");
                        rs.forward(request, response);
                    }
                } catch (Exception e) {
                    request.setAttribute(error, "Deze gebruiker bestaat niet");
                    RequestDispatcher rs = request.getRequestDispatcher("Login.jsp");
                    rs.forward(request, response);
                }
            } finally {
                em.close();
                emf.close();
            }
        } catch (Exception e) {

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
