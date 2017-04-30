mianApp.controller('LoginCtrl',['$scope', '$state', '$location', function($scope, $state, $location){
    $scope.loginIn = function()
   {
   	
   	 $http({
        method  : 'POST',
        url     : '/login.action',
        data    : $.param($scope.Employee)
   		})
        .success(function(data) {
            console.log(data);
   			$location.path('/employee');
        });
   }
}]);
