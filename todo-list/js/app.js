angular.module("myApp", [ "myApp.controllers" ]);

angular.module("myApp.controllers", []).controller(
		"TodoCtrl",
		[
				"$scope",
				function($scope) {

					function createTask(label) {
						return {
							label: label,
							created: new Date()
						};
					}

					
					var task1 = createTask("first task");
					var task2 = createTask("second task");
					var task3 = createTask("third task");
					
					$scope.todoList = [ task1, task2, task3 ];
					
					$scope.select = function (index) {
						$scope.taskName5 = $scope.todoList[index].label;
						$scope.selectedIndex = index;
					};
					
					$scope.edit = function() {
						var index = $scope.selectedIndex;
						
						var task = $scope.todoList[index];
						
						task.label = $scope.taskName5;
						task.created = new Date();
					};
					
					$scope.add = function() {
						console.info("hello info " + $scope.taskName5);

						// List<String> todoList = new ArrayList();
						// todoList.add("todo todo");

						$scope.todoList.push(createTask($scope.taskName5));
						$scope.taskName5 = "";
					};
					
					$scope.remove = function() {
						var index = $scope.selectedIndex;
						
						if(index == undefined || index < 0) {
							alert("Select task please");
						} else {
							$scope.todoList.splice(index, 1);
						}
						
					};
					
					
				} ]);

