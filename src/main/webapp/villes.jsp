<%@page import="service.VilleService"%>
<%@page import="entities.Ville"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Mon site web</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body>

	<!-- Header -->
	<jsp:include page="/WEB-INF/template/header.jsp" />

	<!-- Contenu -->
	<div class="container mt-5">
		<h1>Gestion des villes !</h1>
		<form action="VilleController" method="get">
			<input type="hidden" name="id"
				value="<%=request.getParameter("id") == null ? "" : request.getParameter("id")%>" />
			<div class="form-group">
				<label for="input-name">Nom</label> <input type="text" name="nom"
					value="<%=request.getParameter("nom") == null ? "" : request.getParameter("nom")%>"
					class="form-control" id="nom"
					placeholder="Entrez le nom de la ville">
			</div>
			<button id="add" type="submit" class="btn btn-primary"><%=request.getParameter("id") == null ? "Ajouter" : "Modifier"%></button>
		</form>

		<br>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Ville</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<!-- Ajoutez ici les lignes du tableau pour chaque ville -->
				<%
				VilleService vs = new VilleService();
				for (Ville v : vs.findAll()) {
				%>
				<tr>
					<td><%=v.getId()%></td>
					<td><%=v.getNom()%></td>
					<td><a href="VilleController?id=<%=v.getId()%>&op=update"
						class="btn btn-primary btn-sm mr-2"> <i class="fas fa-edit"></i>
							Modifier
					</a> <a href="VilleController?id=<%=v.getId()%>&op=delete"
						class="btn btn-danger btn-sm"> <i class="fas fa-trash-alt"></i>
							Supprimer
					</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

	</div>

	<!-- Footer -->
	<jsp:include page="/WEB-INF/template/footer.jsp" />

	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>
</html>
