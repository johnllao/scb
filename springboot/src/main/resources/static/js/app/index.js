(function() { 
	
	var app = angular.module('app', []);
	
	app.controller('indexCtrl', ['$http', '$scope', function(http, model) { 
		
		http.get('/tomcatjersey/api/products')
		    .then(function(res) { 
		    	
		    	model.products = res.data;
		    	
		    }, function(res) { 
		    	
		    	alert(res.statusText);
		    	
		    });
		
	}]);
	
})();