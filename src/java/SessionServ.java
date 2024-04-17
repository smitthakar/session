/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author smit
 */
public class SessionServ extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
        String name = request.getParameter("name");
             
            HttpSession session = request.getSession();
            
           
                
            
            
             if(session != null && session.getAttribute("name") != null ){
            String id = session.getId();
            Date start = new Date(session.getCreationTime());
            Date end = new Date();
            long Total = end.getTime() - start.getTime();
            
            Integer count = (Integer) session.getAttribute("count");
            
            
            if(count == null){
                count = 1;
            }else{
                count = count+1 ;
            }
            session.setAttribute("count", count);
            
        
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionServ</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }");
            out.println(".container { max-width: 800px; margin: 20px auto; padding: 20px; }");
            out.println("table { width: 100%; border-collapse: collapse; margin-bottom: 20px; }");
            out.println("th, td { border: 1px solid #ddd; padding: 10px; text-align: right; }");
            out.println("h1, h4 { margin: 0;text-align:center }");
            out.println(".submit-btn { background-color: #4CAF50; color: white; padding: 10px 20px; border: none; cursor: pointer;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<Table>");
            out.println("<tr><td>");
            
            out.println("<h1>Welcome " + session.getAttribute("name") + "</h1>");
            out.println("</td></tr>");
            out.println("<tr><td>");
            out.println("ID: " + id + "");
            out.println("</td></tr>");
            out.println("<tr><td>");
            out.println("Start: " + start + "");
            out.println("</td></tr>");
            out.println("<tr><td>");
            out.println("End: " + end + "");
            out.println("</td></tr>");
            out.println("<tr><td>");
            out.println("Total: " + Total + "");
            out.println("</td></tr>");
            out.println("<tr><td>");
            out.println("Count: " + count + "");
            out.println("</td></tr>");
            out.println("<tr><td>");
            out.print("<form action='LogoutSer' align='center' method='Post'><input type='submit'  value='Logout' class='submit-btn'></form>");
            out.println("</td></tr>");
            out.println("</Table>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            }else{
                response.sendRedirect("index.jsp");
            }
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
