app.controller('typeTemplateController',function ($scope,$controller,typeTemplateService,brandService,specificationService) {

    $controller('baseController',{$scope:$scope})

    //读取列表数据绑定到表单中
    $scope.findAll=function () {
        typeTemplateService.findAll().success(
          function (response) {
            $scope.list=response;
          }
        );
    }

    //分页
    $scope.findPage=function (pageSize,pageNum) {
        typeTemplateService.findPage(pageSize,pageNum).success(
            function (response) {
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total; //更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne=function (id) {
        typeTemplateService.findOne(id).success(
            function (response) {
                $scope.entity=response;

                //转换字符串为json对象（集合）
                $scope.entity.brandIds=JSON.parse($scope.entity.brandIds);
                $scope.entity.specIds=JSON.parse($scope.entity.specIds);
                $scope.entity.customAttributeItems=JSON.parse($scope.entity.customAttributeItems);

            }
        );
    }

    //保存
    $scope.save=function () {
        var serviceObject; //服务层对象
        if($scope.entity.id!=null){
            serviceObject=typeTemplateService.update($scope.entity);
        }else {
            serviceObject=typeTemplateService.add($scope.entity);
        }

        serviceObject.success(
            function (response) {
                if(response.success){
                    $scope.reloadList();
                }else{
                    alert(response.message);
                }
            }
        );
    }

    //批量删除
    $scope.dele=function () {
        typeTemplateService.dele($scope.selectIds).success(
            function (response) {
                if(response){
                    if(response.success){
                        $scope.reloadList();
                        $scope.selectIds=[];
                    }
                }
            }
        );
    }

    $scope.searchEntity={};
    //搜索
    $scope.search=function (pageSize,pageNum) {
        typeTemplateService.search(pageSize,pageNum,$scope.searchEntity).success(
          function (response) {
              $scope.list=response.rows;
              $scope.paginationConf.totalItems=response.total; //更新总记录数
          }
        );
    }

    $scope.brandList={data: []}; //品牌列表

    //读取品牌列表
    $scope.findBrandList=function () {
        brandService.selectOptionList().success(
            function (response) {
                $scope.brandList={data:response};
            }
        );
    }




})