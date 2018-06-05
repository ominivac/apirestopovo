
//criacao de controllers
appCliente.controller("clienteController", function($scope, $http){
	
	$scope.nome = "roberto";
	$scope.sobrenome = "sousa";
	$scope.clientes = [];
	$scope.cliente = {};
	
	carregarClientes = function(){
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
		
		if($scope.frmCliente.$valid){
			$http({method:'POST', url:'http://localhost:8080/clientes', data:$scope.cliente})
			.then(function(response){
				$scope.clientes.push(response.data);
				
				carregarClientes();
				$scope.cancelarAlteracaoCliente();
				$scope.frmCliente.$setPristine(true);
				
				//console.log(response.data);
				//console.log(response.status);
			} , function(response){
				console.log(response.data);
				console.log(response.status);
			} );
		}//if
		else{
			window.alert("dados invalidos");
		}
		
		
		
	};
	
	$scope.excluirCliente= function(cliente){
		$http({method:'DELETE', url:'http://localhost:8080/clientes/'+cliente.id})
		.then(function(response){
			pos = $scope.clientes.indexOf(cliente);
			$scope.clientes.splice(pos, 1);
			
			//console.log(response.data);
			//console.log(response.status);
		} , function(response){
			console.log(response.data);
			console.log(response.status);
		} );
	};
	
	$scope.alterarCliente = function(cli){
		$scope.cliente = angular.copy(cli);
	};
	
	$scope.cancelarAlteracaoCliente = function(){
		$scope.cliente = {};
	};
	
	
	//$scope.carregarClientes();
	carregarClientes();
	
});