var LoginModule = angular.module("LoginModule", []);

LoginModule.controller('LoginCtrl',['$scope', '$state', '$location', '$http','$rootScope',function($scope, $state, $location, $http, $rootScope){
    $scope.loginIn = function()
   {
   	 $http({
        method  : 'GET',
        url     : 'login/checkLoginInfo.action',
        params  : {'employee':angular.toJson($scope.Employee)}
   		})
        .success(function(data) {
            console.log(data);
            if (data != 'failure'){
            	$rootScope.currentUser = $scope.Employee;
            	$location.path('/employee/' + data);
            }
            else{
            	$scope.errorMessage = '账号或者密码错误！';
            }
        });
   }
}]);

var EmployeeModule = angular.module("EmployeeModule", []);

EmployeeModule.controller('EmployeeLeftCtrl',['$scope', '$state', '$location', '$http','$rootScope',function($scope, $state, $location, $http, $rootScope){
}]);