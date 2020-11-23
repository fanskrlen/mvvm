//服务层
app.service('typeTemplateService',function ($http) {

    this.findOne=function (id) {
        return $http.get('../typeTemplate/findOne.do',id);
    }

    this.findAll=function () {
        return $http.get('../typeTemplate/findAll.do');
    }

    this.findPage=function (pageSize,pageNum) {
        return $http.get('../typeTemplate/findPage.do',pageSize,pageNum);
    }

    this.search=function (searchEntity,pageSize,pageNum) {
        return $http.post('../typeTemplate/search.do?pageSize='+pageSize+'&pageNum='+pageNum,searchEntity);
    }

    this.add=function (entity) {
        return $http.post('../typeTemplate/add.do',entity);
    }

    this.dele=function (ids) {
        return $http.get('../typeTemplate/delete.do?ids='+ids);
    }

    this.update=function (entity) {
        return $http.post('../typeTemplate/update/do',entity);
    }

})