(function() { 
	
	var app = angular.module('app', []);
	
	app.controller('controller', ['$http', '$scope', function(http, model) { 
		
		model.message = 'welcome';
		
	}]);
	
})();