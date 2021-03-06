function TodoController($http) {
  var vm = this;
  
  vm.todos = [];
  vm.todo;

  $http.get('/todos').then(function(resp){
    resp.data.forEach(function(i){
      vm.todos.push(i)
    })
  })

  this.addTodo = function(){
    debugger
    $http({
      method: 'POST',
      url: '/todos',
      data: {'title': vm.todo}
    }).then(function(resp){
      debugger
      vm.todos.push(resp.data)
    })

    vm.todo = '';  
  }

  this.done = function(todo){
    var id = todo.id
      for(let i = 0; i < vm.todos.length; i++){
        if(vm.todos[i].id === id){
          var index = vm.todos.indexOf(vm.todos[i])
        }
      }

    todo.checked = true;

    $http({
      method: 'PUT',
      url: '/todos/' + todo.id,
      data: todo
    }).then(function(resp){
      vm.todos[index] = resp.data
    }) 
  }

  this.deleteTodo = function(todo){
    var id = todo.id
        for(let i = 0; i < vm.todos.length; i++){
          if(vm.todos[i].id === id){
            var index = vm.todos.indexOf(vm.todos[i])
          }
        }
        //debugger
    vm.todos.splice(index, 1)

    $http({
      method: 'DELETE',
      url: '/todos/' + todo.id,        
      data: todo
      }) 
  }

}
  
angular
  .module('app')
  .controller('TodoController', ['$http', TodoController]);