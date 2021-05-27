<%--
  Created by IntelliJ IDEA.
  User: Maria Jose
  Date: 26/05/2021
  Time: 8:05 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!DOCTYPE html>

<nav class="navbar navbar-expand-lg navbar-light bg-light" >
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><font color="black"><b>Concesionario De Autos</b></font></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="defecto.do">Notificar defectos</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="addVehicle.do">Vehiculos</a>
                </li>
            </Ul>
        </div>
    </div>
</nav>

<div class="background"style="background-image: url(https://documentacionaldia.com/wp-content/uploads/2021/02/Repuve-login-2.jpg);background-size: 100%;width: 100%;height: 100%;">
    <div>
        <form class="login-form" action="addVehicle.do" method="post">
            <div class="container" style="padding-top:2cm;">
                <div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card border-secondary mb-3">
                            <div class="card-header alert alert-dark text-center"><i class="fas fa-user fa-2x"></i>
                                <font size=6> Vehiculos</font>
                            </div>
                            <div class="card-body">
                                <form >
                                    <div class="form-group row">
                                        <label class="col-md-4 col-form-label text-md-right">Placa</label>
                                        <div class="col-md-6">
                                            <input type="text"  id="placa" class="form-control" name="placa"
                                                    autofocus>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group row">
                                        <label class="col-md-4 col-form-label text-md-right">Marca</label>
                                        <div class="col-md-6">
                                            <input type="text" id="marca" class="form-control" name="marca"
                                                    autofocus>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group row">
                                        <label class="col-md-4 col-form-label text-md-right">Modelo</label>
                                        <div class="col-md-6">
                                            <input type="number"  id="modelo" class="form-control" name="modelo"
                                                    autofocus>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group row">
                                        <label  class="col-md-4 col-form-label text-md-right">Color</label>
                                        <div class="col-md-6">
                                            <input type="text" id="color" class="form-control" name="color"
                                                   autofocus>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group row">
                                        <label  class="col-md-4 col-form-label text-md-right">Tipo vehiculo</label>
                                        <div class="col-md-6">
                                            <input type="text" id="tipoVehiculo" class="form-control" name="tipoVehiculo" >
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group row">
                                        <label  class="col-md-4 col-form-label text-md-right">Precio</label>
                                        <div class="col-md-6">
                                            <input type="number" id="precio" class="form-control" name="precio" >
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group row">
                                        <label  class="col-md-4 col-form-label text-md-right">Propietario</label>
                                        <div class="col-md-6">
                                            <input type="number" id="propietario" class="form-control" name="propietario">
                                        </div>
                                    </div>
                                    <br>
                                    <div class="btn-group" >
                                        <button type="submit" class="btn btn-primary pull-right"  name="act" value="agregar" style="padding-right: 1cm;padding-left: 1cm;">
                                            Agregar vehiculo
                                        </button>

                                        <button type="submit" class="btn btn-primary"  name="act" value="buscar" style="padding-right: 1cm;padding-left: 1cm;transform: translateX(5%)">
                                            Buscar vehiculo
                                        </button>

                                        <button type="submit" class="btn btn-primary pull-right" name="act" value="eliminar" style="padding-right: 1cm;padding-left: 1cm;transform: translateX(10%)">
                                            Eliminar vehiculo
                                        </button>

                                        <button type="submit" class="btn btn-primary pull-left" name="act" value="actualizar" style="padding-right: 1cm;padding-left: 1cm;transform: translateX(15%)">
                                            Actualizar vehiculo
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
