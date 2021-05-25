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
          <a class="nav-link active" aria-current="page" href="defectos.do">Notificar defectos</a>
        </li>
        </Ul>
    </div>
  </div>
</nav>
<section class="ready_started project_form">
  <div class="container">
    <h3 class="text-center">Propietarios</h3>
    <br>
    <center><label>Cedula</label><input type="text" placeholer="cedula"></input> <button class="submit">buscar</button></center>    <div class="ready__started-box">
    <br>
      <form class="main__form">
        <div class="row">
          <div class="col-md-6">
            <div class="form-group">
              <label for="firstName">Nombre</label>
              <input type="text" class="form-control" id="firstName" aria-describedby="firstName" placeholder="John" required>
              <br>
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="lastName">Apellido</label>
              <input type="text" class="form-control" id="lastName" aria-describedby="lastName" placeholder="Doe" required>
              <br>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6">
            <div class="form-group">
              <label for="contactNumber">Celular</label>
              <input type="email" class="form-control" id="contactNumber" aria-describedby="contactNumber" placeholder="xxx-xxxx-xxxxx" required>
              <br>
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="email">Email</label>
              <input type="text" class="form-control" id="email" aria-describedby="email" placeholder="example@xyz.com" required>
              <br>
            </div>
          </div>
        </div>
      </form>
    </div>
  </div>
</section>

</nav>
<section class="ready_started project_form">
  <div class="container">
    <h3 class="text-center">Vehiculos</h3>
    <br>
    <center><label>Placa</label><input type="text" placeholer="cedula"></input> <button class="submit">buscar</button></center>
    <div class="ready__started-box">
    <br>
    <div class="ready__started-box">
      <form class="main__form">
        <div class="row">
          <div class="col-md-6">

            <div class="form-group">
              <label for="marca">Marca</label>
              <input type="text" class="form-control" id="marca" aria-describedby="Marca" placeholder="" required>
              <br>
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="modelo">Modelo</label>
              <input type="text" class="form-control" id="modelo" aria-describedby="Modelo" placeholder="Doe" required>
              <br>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6">
            <div class="form-group">
              <label for="coloxr">Color</label>
              <input type="coloxr" class="form-control" id="coloxr" aria-describedby="coloxr" placeholder="xxx-xxxx-xxxxx" required>
              <br>
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="tipovehiculo">Tipo de vehiculo</label>
              <input type="text" class="form-control" id="tipoVehiculo" aria-describedby="tipoVehiculo" placeholder="example@xyz.com" required>
              <br>
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="precio">Precio</label>
              <input type="text" class="form-control" id="precio" aria-describedby="precio" placeholder="example@xyz.com" required>
              <br>
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="propietario">Propietario</label>
              <input type="text" class="form-control" id="propietario" aria-describedby="propietario" placeholder="example@xyz.com" required>
              <br>
            </div>
          </div>
        </div>
      </form>
    </div>
  </div>
  </div>
</section>