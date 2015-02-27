app.controller("loremController", function($scope, $http){
	$scope.loading = true;
    $http.get("/lorem/s")
    .success(function(json) {
        $scope.text = json;
        console.log($scope.text);
        $scope.loading = false;
    });
});