angular.module('myApp.services', [ 'ngResource' ]).factory(
                'todoService', function($resource) {
                        var service = $resource('rest/todo/:taskId', {}, {});
                        return service;
                });
