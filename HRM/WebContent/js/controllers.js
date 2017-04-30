mianApp.controller('LoginCtrl',['$scope', '$state', '$location', '$http',function($scope, $state, $location, $http){
    $scope.loginIn = function()
   {
   	
   	 $http({
        method  : 'GET',
        url     : 'HRM/login/checkLoginInfo.action',
        params  : {'userid':$scope.Employee.userid,'password':$scope.Employee.password, 'userLevel': $scope.Employee.userLevel}
   		})
        .success(function(data) {
            console.log(data);
   			$location.path('/employee');
        });
   }
}]);
