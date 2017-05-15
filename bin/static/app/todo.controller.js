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
      data: {'title': vm.todo}
    })  
  }

  this.done = function(todo){
    debugger
    todo.checked = true;

    $http({
      method: 'PUT',
      url: '/todos/' + todo.id,
      data: todo
    }) 
  }

  this.deleteTodo = function(){
    //
  }


}
  
angular
  .module('app')
  .controller('TodoController', ['$http', TodoController]);