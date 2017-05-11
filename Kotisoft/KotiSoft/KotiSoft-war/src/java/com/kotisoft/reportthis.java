/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kotisoft;

import com.kotisoft.model.Ticket;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kotisoft.entrybean;
import kotisoft.entrybeanLocal;

/**
 *
 * @author TG
 */
public class reportthis extends HttpServlet {
    
    @EJB
    private entrybeanLocal entrybean;
    

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            
         String name,emailid,model,problem;
         name=request.getParameter("Name");
         emailid=request.getParameter("Emailid");
         model=request.getParameter("Model");
         problem=request.getParameter("Problem");
         Ticket ticket=new Ticket(); 
         ticket.setEmailid(emailid);
         ticket.setModel(model);
         ticket.setName(name);
         ticket.setProblem(problem);
        
        entrybean.addTicket(ticket);
RequestDispatcher rd=request.getRequestDispatcher("dash1.html");
        rd.forward(request, response);        

        
        }catch(Exception e)
        {
      out.print( e.toString())     ;
        }
finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @t
     * 
     * hrows IOException if an I/O error occurs
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
