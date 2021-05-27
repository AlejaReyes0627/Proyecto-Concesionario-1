<%--
  Created by IntelliJ IDEA.
  User: Maria Jose
  Date: 22/05/2021
  Time: 6:20 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<nav class="navbar navbar-expand-lg navbar-light bg-light" >
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><font color="black"><b>Concesionario De Autos</b></font></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="defects.do">Notificar defectos</a>
                </li>
            </Ul>
        </div>
    </div>
</nav>


<div style="background-image: url(https://documentacionaldia.com/wp-content/uploads/2021/02/Repuve-login-2.jpg);background-size: 100%;width: 100%;height: 100%;">
    <div class="container" style="padding-left: 12cm; ">
        <div class="col-md-5">
            <div class="form-area" style="background-color: #FAFAFA;border: 1px solid GREY;">
                <form role="form" action="defects.do" method="post">
                    <br style="clear:both">
                    <h3 style="margin-bottom: 25px;padding: 10px 20px 50px;text-align: center;">Notificar Defectos</h3>
                    <div class="container">
                        <div class="form-group">
                            <input type="text" class="form-control" id="name" name="name" placeholder="Name" required>
                        </div>
                        <br>
                        <div class="form-group">
                            <textarea class="form-control" type="textarea" id="email" name="email" placeholder="email" maxlength="140" rows="7"></textarea>
                        </div>
                        <br>
                        <button type="submit" class="btn btn-primary pull-right">Limpiar</button>
                        <button type="submit" class="btn btn-primary pull-left">Agregar</button>
                        <br>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>
