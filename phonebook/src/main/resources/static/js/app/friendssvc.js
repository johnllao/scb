(function() {
	
	var app = angular.module('app');
	
	app.factory('friendsSvc', ['$http', function(http) { 
		
		var getAllFriends = function(completed) {
			
			http.get('/api/friends').then(function(res) { 
				completed(res.data);
			});
			
		};
		
		var getFriendsByName = function(q, completed) {
			
			http.get('/api/friends?q=' + q).then(function(res) { 
				completed(res.data);
			});
			
		};
		
		return {
			getAllFriends : getAllFriends,
			getFriendsByName: getFriendsByName
		};
		
	}]);
	
})();