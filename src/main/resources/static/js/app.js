//criacao do modulo principal da app
var appCliente = angular.module("appCliente", []);


//criacao de controllers
appCliente.controller("indexController", function($scope, $http){
	
	$scope.nome = "roberto";
	$scope.sobrenome = "sousa";
	
	$http({method:'GET', url:'http://localhost:8080/clientes'})
	.then(function(response){
		console.log(response.data);
		console.log(response.status);
	} , function(response){
		console.log(response.data);
		console.log(response.status);
	} );
	
	
});