var mianApp = angular.module('mianApp',['ui.router','ngGrid','LoginModule','EmployeeModule']);

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
				templateUrl : getLeftTempUrl		
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
		url: '/contract',
		views:{
        'right@employee':{
				templateUrl : 'tpls/contract.html'
			}
      }
	})
	.state('employee.employeeInfo',{
		url: '/employeeInfo',
		views:{
        'right@employee':{
				templateUrl : 'tpls/employeeInfo.html'
			}
      }
	})
	.state('employee.employeeInfoE',{
		url: '/employeeInfoE',
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

