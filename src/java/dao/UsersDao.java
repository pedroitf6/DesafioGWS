/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Users;
import util.DbUtil;

/**
 *
 * @author pedro
 */
public class UsersDao {

    private Connection connection;

    public UsersDao() {
        connection = DbUtil.getConnection();

    }

    public void inserirUser(Users users) {
        try {
            
        //String sql = "insert into users (nome, email, ddd_fixo, fixo, ddd_cel, cel, senha, data_cadastro) values( ?, ?, ?, ?, ?, ?, ?, ?)";
        //PreparedStatement stmt = connection.prepareStatement(sql);
            
            PreparedStatement stmt = connection
                   .prepareStatement("insert into users (nome, email, ddd_fixo, fixo, ddd_cel, cel, senha, data_cadastro) values( ?, ?, ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, users.getNome());
            stmt.setString(2, users.getEmail());
            stmt.setString(3, users.getDdd_Fixo());
            stmt.setString(4, users.getFixo());
            stmt.setString(5, users.getDdd_Cel());
            stmt.setString(6, users.getCel());
            stmt.setString(7, users.getSenha());
            stmt.setString(8, users.getDataDeCadastro());
            stmt.execute();
            stmt.close();
            stmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }   
    }
    
    public Users getUsersEmail(String emailBancoDados){
        Users users = new Users();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where email=?");
            preparedStatement.setString(1, emailBancoDados);
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                users.setEmail(rs.getString("email"));
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    
    public Users login(String login, String senha){
        Users users = new Users();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where email=? and senha=?");
            preparedStatement.setString(1, "email");
            preparedStatement.setString(2, "senha");
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                
                
            }
            
            preparedStatement.close();
            preparedStatement.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }

}
