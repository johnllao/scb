(function() { 
	
	var app = angular.module('app');
	
	app.controller('controller', ['friendsSvc', '$scope', function(svc, model) { 
		
		var refreshFriends = function(data) { 
			model.friends = data;
		};
		
		model.search = function() {
			svc.getFriendsByName(model.q, refreshFriends);
		};
		
		svc.getAllFriends(refreshFriends);
		
	}]);
	
})();