//criacao do modulo principal da app
var appCliente = angular.module("appCliente", []);


//criacao de controllers
appCliente.controller("indexController", function($scope, $http){
	
	$scope.nome = "roberto";
	$scope.sobrenome = "sousa";
	$scope.clientes = [];
	$scope.cliente = {};
	
	$scope.carregarClientes = function(){
		$http({method:'GET', url:'http://localhost:8080/clientes'})
		.then(function(response){
			$scope.clientes = response.data;
			
			console.log(response.data);
			console.log(response.status);
		} , function(response){
			console.log(response.data);
			console.log(response.status);
		} );
	
	};
	
	
	$scope.salvarCliente= function(){
		$http({method:'POST', url:'http://localhost:8080/clientes', data:$scope.cliente})
		.then(function(response){
			$scope.clientes.push(response.data);
			
			//console.log(response.data);
			//console.log(response.status);
		} , function(response){
			console.log(response.data);
			console.log(response.status);
		} );
	};
	
	
	$scope.carregarClientes();
});