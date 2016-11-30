<!DOCTYPE html>
<html lang="en" ng-app="app">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>Tomcat / Jersey</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
	<link rel="stylesheet" type="text/css" href="css/app.css" />
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/angular.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body ng-controller="indexCtrl">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h3>Products</h3>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th class="col-lg-1">ID</th>
							<th>Name</th>
							<th class="col-lg-1">Price</th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="product in products">
							<td class="col-lg-1">{{ product.id }}</td>
							<td>{{ product.name }}</td>
							<td>{{ product.price }}</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/app/index.js"></script>
</body>
</html>
