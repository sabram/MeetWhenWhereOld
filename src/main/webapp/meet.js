var meetModule = angular.module('MeetWhenWhere', ['restangular']);

meetModule.controller('MeetingCtrl', function($scope, $http, Restangular) {

//    $scope.meeting = Restangular.one('meeting').get().$object;

    var baseMeetings = Restangular.all('meetings');

// This will query /meetings and return a promise.
    baseMeetings.getList().then(function(meetings) {
        $scope.meetings = meetings;
    });



    $scope.addMeeting = function() {
        console.log("addMeeting");
        var newMeeting = {"id":8,"name":$scope.meetingName};
        baseMeetings.post(newMeeting).then(function(response) {
            $scope.meeting = response;
            console.log(response);
            $scope.meetings.push(response);
        });
    };
});
