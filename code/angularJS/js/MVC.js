var mainModel = angular.module('mainModel',[]);

mainModel.controller('CommonController',['$scope',function($scope){
	var isTrue = true;
	$scope.userInfo={
		userName :"liubaolin",
		password : "11111"
	};
	$scope.test=function(){
		debugger;
		if(isTrue){
			isTrue = !isTrue;
			$scope.userInfo={
				userName : "henian",
				password : "222"
			};
		}
		else
		{
			isTrue = !isTrue;
			$scope.userInfo={
				userName :"liubaolin",
				password : "11111"
			};
		}
	};
}])

