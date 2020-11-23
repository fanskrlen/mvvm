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



})