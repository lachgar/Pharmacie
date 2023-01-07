<%@page import="service.ZoneService"%>
<%@page import="entities.Zone"%>
<%@page import="entities.Ville"%>
<%@page import="service.VilleService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="fr">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<title>Formulaire de création de zone</title>
</head>

<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-4">Création de zone</h1>
				<form action="ZoneController" method="get">
					<div class="form-group">
						<label for="zoneName">Nom de la zone</label> <input type="text"
							class="form-control" name="zoneName" id="zoneName">
					</div>
					<div class="form-group">
						<label for="city">Ville</label> <select class="form-control"
							id="city" name="city">
							<%
							VilleService vs = new VilleService();
							for (Ville v : vs.findAll()) {
							%>
							<option value="<%=v.getId()%>"><%=v.getNom()%></option>
							<%
							}
							%>

						</select>
					</div>
					<button type="submit" class="btn btn-primary btn-block">Créer</button>
				</form>
			</div>
		</div>
		<div class="row mt-5">
			<div class="col-md-6 offset-md-3">
				<h2 class="text-center mb-4">Liste des zones</h2>
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nom</th>
							<th scope="col">Ville</th>
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
					<%
					ZoneService  zs = new ZoneService();
					   for(Zone zone : zs.findAll()){
					 %>
						<tr>
							<th scope="row"><%= zone.getId() %></th>
							<td><%= zone.getNom() %></td>
							<td><%= zone.getVille().getNom() %></td>
							<td>
								<button class="btn btn-danger btn-sm">Supprimer</button>
								<button class="btn btn-secondary btn-sm">Modifier</button>
							</td>

						</tr>
					<%} %>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.16.6/dist/umd/popper.min.js"
		integrity="sha384-Q2XjA0n+bJZPVZ8WpZj1nAJpAEYtRnG8WPU9+4B3tJ5Ht3Kj2gSZM5PZO5NQq5g5E"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>

</html>

