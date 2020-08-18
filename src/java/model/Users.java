/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class Users {
    
    private String Nome;
    private String Email;
    private String ddd_Fixo;
    private String Fixo;
    private String ddd_Cel;
    private String Cel;
    private String Senha;
    private String emailLogin;
    private String senhaLogin;

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
    
   
    Date data = new Date();
    SimpleDateFormat formatar = new SimpleDateFormat("yyyy/MM/dd");
    String dataDeCadastro = formatar.format(data);

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDdd_Fixo() {
        return ddd_Fixo;
    }

    public void setDdd_Fixo(String ddd_Fixo) {
        this.ddd_Fixo = ddd_Fixo;
    }

    public String getFixo() {
        return Fixo;
    }

    public void setFixo(String Fixo) {
        this.Fixo = Fixo;
    }

    public String getDdd_Cel() {
        return ddd_Cel;
    }

    public void setDdd_Cel(String ddd_Cel) {
        this.ddd_Cel = ddd_Cel;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public SimpleDateFormat getFormatar() {
        return formatar;
    }

    public void setFormatar(SimpleDateFormat formatar) {
        this.formatar = formatar;
    }

    public String getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    @Override
    public String toString() {
        return "Users{" + "Nome=" + Nome + ", Email=" + Email + ", ddd_Fixo=" + ddd_Fixo + ", Fixo=" + Fixo + ", ddd_Cel=" + ddd_Cel + ", Cel=" + Cel + ", Senha=" + Senha + ", emailLogin=" + emailLogin + ", senhaLogin=" + senhaLogin + ", data=" + data + ", formatar=" + formatar + ", dataDeCadastro=" + dataDeCadastro + '}';
    }

    
    
}
