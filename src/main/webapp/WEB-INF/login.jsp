<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<div class="background"style="background-image: url(https://documentacionaldia.com/wp-content/uploads/2021/02/Repuve-login-2.jpg);background-size: 100%;width: 100%;height: 100%;">
    <div>
        <form class="login-form" method="post">
            <div class="container" style="padding-top:2cm;">
                <div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card border-secondary mb-3">
                            <div class="card-header alert alert-dark text-center"><i class="fas fa-user fa-2x"></i>
                                <font size=6> Login</font>
                            </div>
                            <div class="card-body">
                                <form action="login.do" method="post">
                                    <div class="form-group row">
                                        <label for="user" class="col-md-4 col-form-label text-md-right">Nombre de Usuario</label>
                                        <div class="col-md-6">
                                            <input type="text" id="user" class="form-control" name="user"
                                                   autofocus>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="password" class="col-md-4 col-form-label text-md-right">Password</label>
                                        <div class="col-md-6">
                                            <input type="password" id="password" class="form-control" name="password" >
                                        </div>
                                    </div>
                                    <div class="col-md-6 offset-md-4"  style="padding-left: 2cm; padding-top: 0.3cm">
                                        <button type="submit" class="btn btn-primary" name="act" value="buscar" style="padding-right: 1cm;padding-left: 1cm;">
                                            Login
                                        </button>
                                        <button type="submit" name="act" value="agregar" class="btn btn-primary"  style="padding-right: 1cm;padding-left: 1cm;">
                                            Registrar
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
