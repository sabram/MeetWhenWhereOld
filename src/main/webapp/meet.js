var letsMeetModule = angular.module('letsMeet', ['restangular']);

letsMeetModule.controller('MeetingCtrl', function($scope, $http, Restangular) {

//    $scope.meeting = Restangular.one('meeting').get().$object;

    $scope.meetings = Restangular.all('meetings').getList().$object;



    $scope.addMeeting = function() {
        firstAccount.post("new", $scope.meeting)
    };
});