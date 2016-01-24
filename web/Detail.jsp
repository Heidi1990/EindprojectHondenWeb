<%@page import="bll.Hond"%>
<%@include file="Template/Header.jsp" %>
<% Hond hond = (Hond)request.getAttribute("DetailHond"); %>
<div class="container">

    <!-- Page Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Wenst u deze hond te adopteren ?</h1>
        </div>
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-md-5">
            <a href="#">
                <img class="img-responsive" src="<%= hond.getFoto() %>" alt="">
            </a>
        </div>
        <div class="col-md-7">
            <h3><%= hond.getNaam() %></h3>
            <h4>Leeftijd: <%= hond.getLeeftijd()%> jaar</h4>
            <h4><%= hond.getRas()%></h4>
            <h4><%= hond.getGeslacht()%></h4>
            <p><%= hond.getBeschrijving()%></p>
            <a class="btn btn-primary" href="Adopteren?id=<%= hond.getId() %>">Akkoord <span class="glyphicon glyphicon-chevron-right"></span></a>
            <a class="btn btn-danger" href="LaadHondenAdopteren">Niet akkoord <span class="glyphicon glyphicon-remove"></span></a>
        </div>
    </div>

    <hr>
</div>

<%@include file="Template/Footer.jsp" %>