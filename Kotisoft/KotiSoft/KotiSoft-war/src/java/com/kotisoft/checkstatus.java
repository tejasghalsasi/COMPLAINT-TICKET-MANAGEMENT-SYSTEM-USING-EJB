/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kotisoft;

import com.kotisoft.model.Ticket;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kotisoft.entrybeanLocal;

/**
 *
 * @author TG
 */
@WebServlet(name = "checkstatus", urlPatterns = {"/checkstatus"})
public class checkstatus extends HttpServlet {
    @EJB
    entrybeanLocal entrybean;

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
 
out.print("<center><img src=kotisoft.jpg height=250></center> <br><br>") ;
            String emailid;
         emailid=request.getParameter("emailid1234");
         
        Ticket ticket=entrybean.getTicket(emailid);

if(ticket!=null)
{
    

        out.print("<br><br><center> NAME: "+ticket.getName()+"<br>");
         out.print("EMAIL: "+ticket.getEmailid()+"<br>");
         out.print("MODEL: "+ticket.getModel()+"<br>");
         out.print("PROBLEM: "+ticket.getProblem()+"<br>");
         out.print("COST: "+ticket.getCost()+"<br>");
         out.print("STATUS: "+ticket.getStatus()+"<br> </center>");
         
out.print("<br><center><b><br><a href=index.jsp > Click here to go back to main menu</a></center></b>");


}
else
    out.print("No User found");

         
        } finally {            
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
