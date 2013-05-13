angular.module('myApp.services', [ 'ngResource' ]).factory('todoService',
		function($resource) {
			var service = $resource('rest/todo/:todoId', {}, {});
			return service;
		});
