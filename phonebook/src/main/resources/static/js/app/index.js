(function() { 
	
	var app = angular.module('app', []);
	
	app.controller('controller', ['$http', '$scope', function(http, model) { 
		
		http.get('/api/friends').then(function(res) { 
		
			model.friends = res.data;
			
		});
		
	}]);
	
})();