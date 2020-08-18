<%-- 
    Document   : cadastro
    Created on : 14/08/2020, 23:15:16
    Author     : pedro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>Tela de Login</title>
    </head>
    <body>

        <div class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-md-5">
                        <form method="post" action='UsersController'>

                            <h3> Cadastro de Usúario</h3><br/>

                            <div class="form-group">
                                <input type="text" name="nome" class="form-control input-lg" placeholder="Nome" value="<c:out value="${users.nome}"/>" />

                            </div>

                            <div class="form-group">
                                <input type="email" name="email" class="form-control input-lg" placeholder="E-mail" value="<c:out value="${users.email}" />"/>

                            </div>

                            <div class="form-group">
                                <input type="tel" name="ddd_fixo" class="form-control input-lg" placeholder="DDD" value="<c:out value="${users.ddd_fixo}" />"/>

                            </div>

                            <div class="form-group">
                                <input type="tel" name="fixo" class="form-control input-lg" placeholder="Telefone Fixo" value="<c:out value="${users.fixo}" />"/>

                            </div>

                            <div class="form-group">
                                <input type="tel" name="ddd_cel"  class="form-control input-lg" placeholder="DDD" value="<c:out value="${users.ddd_cel}" />" />

                            </div>

                            <div class="form-group">
                                <input type="tel" name="cel"  class="form-control input-lg" placeholder="Celular" value="<c:out value="${users.cel}" />"/>

                            </div>

                            <div class="form-group">
                                <input type="password" name="senha"  class="form-control input-lg" placeholder="Senha" value="<c:out value="${users.senha}" />" />

                            </div>

                            <div>
                                <input type="submit" class="btn-lg btn-primary" value="Cadastrar"/>
                            </div>

                        </form>
                    </div>

                    <div class="col-md-2"></div>

                    <div class="col-md-5">
                        <form role="form" action="GET" action='UsersController'>

                            <h3>Login </h3><br/>

                            <div class="form-group">
                                <input type="email" name="emailLogin" class="form-control input-lg" placeholder="E-mail"/>
                            </div>

                            <div class="form-group">
                                <input type="password" name="senhaLogin" class="form-control input-lg" placeholder="Senha"/>
                            </div>

                            <div>
                                <input type="submit" class="btn-lg btn-primary" value="Entrar"/>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>           




    </body>
</html>
