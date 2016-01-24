<%@page import="bll.Klant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="resources/Site.css"/>
    <title>Hondenwinkel</title>
</head>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="Index.jsp" class="navbar-brand">Home</a>
                <a href="LaadHondenAdopteren" class="navbar-brand">Honden ter adoptie</a>
                <a href="LaadGeadopteerdeHonden" class="navbar-brand">Honden al geadopteerd</a>
                <a href="Contact.jsp" class="navbar-brand">Contact</a>
                <% if(session.getAttribute("AangemeldeGebruiker") != null) { %>
                <% Klant klant = (Klant)session.getAttribute("AangemeldeGebruiker"); %>
                <a href="" class="navbar-brand"><%= klant.getVoornaam() %></a>
                <% }else{ %>
                <a href="Registreren.jsp" class="navbar-brand">Registreren</a>
                <a href="Login.jsp" class="navbar-brand">Log in</a>
                <% } %>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                </ul>
            </div>
        </div>
    </div>
    <div class="container body-content">