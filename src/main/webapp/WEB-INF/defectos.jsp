<%--
  Created by IntelliJ IDEA.
  User: Maria Jose
  Date: 22/05/2021
  Time: 6:20 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<section class="ready_started project_form">
    <link rel="stylesheet" href="diseño.css">
    <div class="container">
        <h3 class="text-center">Notificacion de Defectos</h3>
        <br>
        <center><label>Placa</label><input type="text" placeholer="cedula"></input> <button class="submit">buscar</button></center>
        <div class="ready__started-box">
            <br>
            <div class="ready__started-box">
                <form class="main__form">
                    <div class="row">
                        <div class="col-md-6">
                            <center>
                            <div class="form-group form-message">
                                <label for="message">Defectos</label>
                                <textarea class="form-control"  id="message" rows="6" placeholder="Message"></textarea>

                            </div>
                            </center>
                        </div>


                    </div>
                </form>

            </div>
        </div>
    </div>
</section>