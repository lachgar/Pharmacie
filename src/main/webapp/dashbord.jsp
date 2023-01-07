<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
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

<title>Statistiques des pharmacies</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Statistiques des pharmacies</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Accueil</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Gestion
						des villes</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Gestion
						des zones</a></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid">
		<h1>Statistiques de la ville</h1>

		<div class="row mt-5">
			<div class="col-sm-4">
				<div class="card text-center">
					<div class="card-body">
						<h5 class="card-title">Nombre de zones</h5>
						<p class="card-text" id="num-zones">10</p>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card text-center">
					<div class="card-body">
						<h5 class="card-title">Nombre de pharmacies</h5>
						<p class="card-text" id="num-pharmacies">20</p>
					</div>
				</div>
			</div>
		</div>

		<canvas id="pharmacies-by-zone" class="mt-5"></canvas>
	</div>
</body>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js"></script>
<script type="text/javascript">
	var ctx = document.getElementById('pharmacies-by-zone').getContext('2d');
	var chart = new Chart(ctx, {
		type : 'bar',
		data : {
			labels : [ "Zone 1", "Zone 2", "Zone 3" ],
			datasets : [ {
				label : 'Nombre de pharmacies',
				data : [ 10, 15, 20 ],
				backgroundColor : 'rgba(255, 99, 132, 0.2)',
				borderColor : 'rgba(255, 99, 132, 1)',
				borderWidth : 1
			} ]
		},
		options : {
			scales : {
				yAxes : [ {
					ticks : {
						beginAtZero : true
					}
				} ]
			}
		}
	});
</script>
</html>
