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

<title>Formulaire d'inscription</title>
</head>

<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-4">Inscription</h1>
				<form>
					<div class="form-group">
						<label for="firstName">Prénom</label> <input type="text"
							class="form-control" id="firstName">
					</div>
					<div class="form-group">
						<label for="lastName">Nom</label> <input type="text"
							class="form-control" id="lastName">
					</div>
					<div class="form-group">
						<label for="email">Adresse email</label> <input type="email"
							class="form-control" id="email" aria-describedby="emailHelp">
						<small id="emailHelp" class="form-text text-muted">Nous ne
							partagerons jamais votre adresse email avec qui que ce soit.</small>
					</div>
					<div class="form-group">
						<label for="password">Mot de passe</label> <input type="password"
							class="form-control" id="password">
					</div>
					<div class="form-group">
						<label for="passwordConfirm">Confirmez votre mot de passe</label>
						<input type="password" class="form-control" id="passwordConfirm">
					</div>
					<button type="submit" class="btn btn-primary btn-block">S'inscrire</button>
				</form>
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
