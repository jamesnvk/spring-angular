function TodoService($http){
  
  function getTodos(){
    $http.get('/todos').then(function(resp){
      resp.data.forEach(function(i){
        vm.todos.push(i)
      })
    })
  }

  function add(){
    return $http({
      method: 'POST',
      url: '/todos',
      data: {'title': vm.todo}
    })
  }


}


angular
  .module('app')
  .service('TodoService', ['$http', TodoService]);