//criacao do modulo principal da app
var appCliente = angular.module("appCliente", []);


//criacao de controllers
appCliente.controller("indexController", function($scope){
	
	$scope.nome = "roberto";
	$scope.sobrenome = "sousa";
	
});