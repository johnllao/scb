(function() { 
	
	var app = angular.module('app', []);
	
	var search = function(http, model) {
		
		http.get('/api/friends?q=' + model.q).then(function(res) { 
			
			model.friends = res.data;
			
		});
		
	}
	
	app.controller('controller', ['$http', '$scope', function(http, model) { 
		
		model.search = function() {
			search(http, model);
		};
		
		http.get('/api/friends').then(function(res) { 
		
			model.friends = res.data;
			
		});
		
	}]);
	
})();