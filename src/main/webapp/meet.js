var letsMeetModule = angular.module('letsMeet', ['restangular']);

letsMeetModule.controller('MeetingCtrl', function($scope, $http, Restangular) {

//    $http.get('http://localhost:8080/meeting').
//        success(function(data) {
//            $scope.meeting = data;
//        });

//    $scope.meeting = Restangular.oneUrl('googlers', 'http://localhost:8080/meeting').get();
//    $scope.meeting = Restangular.one('http://localhost:8080/meeting');
//    $scope.meeting = Restangular.all('http://localhost:8080/meeting');
    $scope.meeting = Restangular.one('meeting').get().$object;

});