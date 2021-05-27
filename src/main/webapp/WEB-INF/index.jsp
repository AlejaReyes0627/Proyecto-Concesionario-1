<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!DOCTYPE html>

<nav class="navbar navbar-expand-lg navbar-light bg-light" >
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><font color="red"><b>Concesionario De Autos</b></font></a>
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

<div class="background"style="background-image: url(https://documentacionaldia.com/wp-content/uploads/2021/02/Repuve-login-2.jpg);background-size: 100%;width: 100%;height: 100%;">
  <div>
    <form class="login-form"  action="addOwner.do" method="post">
      <div class="container" style="padding-top:2cm;">
        <div class="row justify-content-center">
          <div class="col-md-8">
            <div class="card border-secondary mb-3">
              <div class="card-header alert alert-dark text-center"><i class="fas fa-user fa-2x"></i>
                <font size=6> Propietarios</font>
              </div>
              <div class="card-body">
                <form >
                  <div class="form-group row">
                    <label class="col-md-4 col-form-label text-md-right">Cedula</label>
                    <div class="col-md-6">
                      <input type="number"  id="identification" class="form-control" name="identification"
                             required autofocus>
                    </div>
                  </div>
                  <br>
                  <div class="form-group row">
                    <label class="col-md-4 col-form-label text-md-right">Nombre</label>
                    <div class="col-md-6">
                      <input type="text" id="name" class="form-control" name="name"
                             required autofocus>
                    </div>
                  </div>
                  <br>
                  <div class="form-group row">
                    <label class="col-md-4 col-form-label text-md-right">Apellido</label>
                    <div class="col-md-6">
                      <input type="text"  id="last_name" class="form-control" name="last_name"
                             required autofocus>
                    </div>
                  </div>
                  <br>
                  <div class="form-group row">
                    <label  class="col-md-4 col-form-label text-md-right">Telefono</label>
                    <div class="col-md-6">
                      <input type="number" id="phone" class="form-control" name="phone"
                             required autofocus>
                    </div>
                  </div>
                  <br>
                  <div class="form-group row">
                    <label  class="col-md-4 col-form-label text-md-right">E-mail</label>
                    <div class="col-md-6">
                      <input type="text" id="email" class="form-control" name="email" required>
                    </div>
                  </div>
                  <br>
                  <div class="col-md-6 offset-md-4"  style="padding-left: 2cm; padding-top: 0.3cm">
                    <button type="submit" class="btn btn-primary"  style="padding-right: 1cm;padding-left: 1cm;">
                      Agregar propietario
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
</div>