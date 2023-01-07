<%@page import="entities.Pharmacien"%>
<%@page import="entities.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Localisation des pharmacies</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <%
      Pharmacien pharmacien = (Pharmacien)session.getAttribute("user");
  %>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="#">Bonjour <%= pharmacien.getNom() %></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#">Accueil</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="./villes.jsp">Gestion des villes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="zones.jsp">Gestion des zones</a>
      </li>
    </ul>
  </div>
</nav>
