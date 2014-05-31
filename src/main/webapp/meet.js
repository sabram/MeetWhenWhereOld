var letsMeetModule = angular.module('letsMeet', []);

letsMeetModule.controller('MeetingCtrl', function($scope, $http) {
    $http.get('http://localhost:8080/meeting').
        success(function(data) {
            $scope.meeting = data;
        });
});