/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsersDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Users;

/**
 *
 * @author pedro
 */
@WebServlet(name = "UsersController", urlPatterns = {"/UsersController"})
public class UsersController extends HttpServlet {

    private static String INSERT = "/index.jsp";
    private UsersDao dao;

    public UsersController() {
        super();
        dao = new UsersDao();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        /*String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("inserir")) {
            forward = INSERT;
            String email = (request.getParameter("email"));
            Users users = dao.getUsersEmail(email);
            request.setAttribute("email", email);
        }*/
        
        Users users = new Users();
        users.setEmailLogin(request.getParameter("emailLogin"));
        users.setSenhaLogin(request.getParameter("senhaLogin"));
        dao.login(users);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        Users users = new Users();
        String emaildigitado = request.getParameter("email");

        if (emaildigitado != null) {

            users.setNome(request.getParameter("nome"));
            users.setEmail(request.getParameter("email"));
            users.setDdd_Fixo(request.getParameter("ddd_fixo"));
            users.setFixo(request.getParameter("fixo"));
            users.setDdd_Cel(request.getParameter("ddd_cel"));
            users.setCel(request.getParameter("cel"));
            users.setSenha(request.getParameter("senha"));
            users.setEmail(request.getParameter("email"));

            dao.inserirUser(users);

        } else {

            dao.getUsersEmail(emaildigitado);
            //System.out.println("O e-mail" + " " + email + " " + "já existe");
        }
        
        

    }

}
