app.controller('brandController',function ($scope,$controller,brandService) {

    //第一个参数要继承的controller
    $controller('baseController',{$scope:$scope}); //继承

    //与后端交互
    //查询品牌列表
    $scope.findAll = function () {  //定义方法findAll()查询
        brandService.findAll().success(  //这里是AJAX请求，success表示成功
            function (response) {  //参数是函数类型，response名称任意定义变量
                $scope.list = response;
            }
        );
    }

    // //刷新列表
    // $scope.reloadList = function () {
    //     $scope.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    // }

    //分页
    $scope.findPage = function (page, size) {
        brandService.findPage(page, size).success(
            function (response) {
                $scope.list = response.rows; //显示当前页数据
                $scope.paginationConf.totalItems = response.total; //更新总记录数
            }
        );
    }

    //新增和修改公用的添加
    $scope.save = function () {
        var object = null;
        if ($scope.entity.id != null) {
            object = brandService.update($scope.entity);
        } else {
            object = brandService.add($scope.entity);
        }
        object.success(
            function (response) {
                if (response.success) {
                    $scope.reloadList(); //刷新
                } else {
                    alert(response.message);
                }
            }
        );
    }

    //查询实体(用于修改)
    $scope.findOne = function (id) {
        brandService.findOne(id).success(
            function (response) {
                $scope.entity = response;  //response是后端传过来的实体
            }
        );
    }

    //批量删除
    $scope.dele = function () {
        if (confirm('确定要删除吗？')) {
            brandService.dele($scope.selectIds).success(
                function (response) {
                    if (response.success) {
                        $scope.reloadList();  //刷新
                        alert(response.message);
                    } else {
                        alert(response.message);
                    }
                }
            );
        }
    }

    //条件查询对象的定义
    $scope.searchEntity = {};
    //条件查询
    $scope.search = function (page, size) {
        brandService.search(page, size, $scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;  //显示当前页数据
                $scope.paginationConf.totalItems = response.total;  //更新总记录数
            }
        );
    }
})