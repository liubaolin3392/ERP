var mianApp = angular.module('mianApp',['ui.router','LoginModule','EmployeeModule']);

mianApp.run(['$rootScope', '$state', '$stateParams',
     function($rootScope, $state, $stateParams) {
         $rootScope.$state = $state;
         $rootScope.$stateParams = $stateParams;
     }
 ]);

mianApp.config(function($stateProvider, $urlRouterProvider){
	$urlRouterProvider.otherwise('/index');
	$stateProvider
	.state('index',{
		url: '/index',
		views: {
			'':{
				templateUrl : 'index.html'
			},
			'login@index':{
				templateUrl : 'tpls/login.html',
				controller: 'LoginCtrl'
			}
		}
	})
	.state('employee',{
		url: '/employee/:left',
		views: {
			'':{
				templateUrl: 'president/index.html'
			},
			'top@employee':{
				templateUrl : 'tpls/top.html'
			},
			'left@employee':{
				templateUrl : getLeftTempUrl,
				controller: 'EmployeeLeftCtrl'				
			},
			'right@employee':{
				templateUrl : 'tpls/right.html'
			},
			'bottom@employee':{
				templateUrl : 'tpls/bottom.html'
			}
		}
	})
	.state('employee.contract',{
		url: '/employee/contract',
		views:{
        'right@employee':{
				templateUrl : 'tpls/contract.html'
			}
      }
	})
	.state('employee.employeeInfo',{
		url: '/employee/employeeInfo',
		views:{
        'right@employee':{
				templateUrl : 'president/employee.html'
			}
      }
	})
	
	function getLeftTempUrl($stateParams) {
        return $stateParams.left + '/left.html';
    }
});

