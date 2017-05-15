function TodoController($http) {
  var vm = this;
  this.todos = [];

  vm.todo;

  $http.get('/todos').then(function(resp){
    resp.data.forEach(function(i){
      vm.todos.push(i)
    })
  })

  this.addTodo = function(){
    $http({
      method: 'POST',
      url: '/todos',
      data: {'title': vm.todo},
    })  
  }


}
  
angular
  .module('app')
  .controller('TodoController', ['$http', TodoController]);