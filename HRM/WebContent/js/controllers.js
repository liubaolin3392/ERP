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

/**
 * 这里是员工列表模块
 * @type {[type]}
 */
var EmployeeModule = angular.module("EmployeeModule", []);
EmployeeModule.controller('EmployeeListCtrl', function($scope, $http, $state, $stateParams) {
    $scope.filterOptions = {
        filterText: "",
        useExternalFilter: true
    };
    $scope.totalServerItems = 0;
    $scope.pagingOptions = {
        pageSizes: [5, 10, 20],
        pageSize: 5,
        currentPage: 1
    };
    $scope.setPagingData = function(data, page, pageSize) {
        
        var pagedData = data.slice((page - 1) * pageSize, page * pageSize);
        $scope.employees = pagedData;
        $scope.totalServerItems = data.length;
        if (!$scope.$$phase) {
            $scope.$apply();
        }
    };

    //这里可以根据路由上传递过来的bookType参数加载不同的数据
    console.log($stateParams);
    $scope.getPagedDataAsync = function(pageSize, page, searchText) {
    	var data;
    	var filterMap = {}
        setTimeout(function() {
            $http({
            	method:'POST',
            	url:'employee/getAllEmployee.action',
            	params  : {'filterParam':angular.toJson(filterMap)}
            	})
                .success(function(data) {
                	data = data.filter(function(item) {
                        return JSON.stringify(item);
                    });
                    $scope.setPagingData(data, page, pageSize);
                });
        }, 100);
    };

    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);

    $scope.$watch('pagingOptions', function(newVal, oldVal) {
        if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);
    $scope.$watch('filterOptions', function(newVal, oldVal) {
        if (newVal !== oldVal) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);

    $scope.gridOptions = {
        data: 'employees',
        rowTemplate: '<div style="height: 100%"><div ng-style="{ \'cursor\': row.cursor }" ng-repeat="col in renderedColumns" ng-class="col.colIndex()" class="ngCell ">' +
            '<div class="ngVerticalBar" ng-style="{height: rowHeight}" ng-class="{ ngVerticalBarVisible: !$last }"> </div>' +
            '<div ng-cell></div>' +
            '</div></div>',
        multiSelect: false,
        enableCellSelection: true,
        enableRowSelection: false,
        enableCellEdit: true,
        enablePinning: true,
        columnDefs: [{
            field: 'eid',
            displayName: '序号',
            width: 60,
            pinnable: false,
            sortable: false
        }, {
            field: 'username',
            displayName: '姓名',
            enableCellEdit: true
        }, {
            field: 'password',
            displayName: '密码',
            enableCellEdit: true,
            width: 100
        }, {
            field: 'age',
            displayName: '年龄',
            enableCellEdit: true,
            width: 100
        }, {
            field: 'sex',
            displayName: '性别',
            enableCellEdit: true,
            width: 60
        },{
            field: 'department',
            displayName: '部门',
            enableCellEdit: true,
            width: 100
        },
        {
            field: 'position',
            displayName: '职务',
            enableCellEdit: true,
            width: 60
        },
        {
            field: 'phone',
            displayName: '电话',
            enableCellEdit: true,
            width: 100
        },
        {
            field: 'userlevel',
            displayName: '级别',
            enableCellEdit: true,
            width: 60
        },
        {
            field: 'eid',
            displayName: '编辑',
            enableCellEdit: false,
            sortable: false,
            pinnable: false,
            cellTemplate: '<div><a ui-sref="bookdetail({bookId:row.getProperty(col.field)})" id="{{row.getProperty(col.field)}}">编辑</a></div>'
        }],
        enablePaging: true,
        showFooter: true,
        totalServerItems: 'totalServerItems',
        pagingOptions: $scope.pagingOptions,
        filterOptions: $scope.filterOptions
    };
});