<%@page import="java.util.List"%>
<%@page import="bll.Hond"%>
<%@include file="Template/Header.jsp" %>
<% List<Hond> hondenLijst = (List<Hond>) request.getAttribute("HondenLijst"); %>
<!-- Page Content -->
<div class="container">

    <!-- Page Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Beschikbare honden ter adoptie</h1>
        </div>
    </div>
    <!-- /.row -->
    <% for (Hond hond : hondenLijst) { %>
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
            <%if(session.getAttribute("AangemeldeGebruiker") != null) {%>
            <a class="btn btn-primary" href="Detail?id=<%= hond.getId() %>">Adopteren <span class="glyphicon glyphicon-chevron-right"></span></a>
            <% } %>
        </div>
    </div>

    <hr>
    <% }%>
</div>



<%@include file="Template/Footer.jsp" %>

