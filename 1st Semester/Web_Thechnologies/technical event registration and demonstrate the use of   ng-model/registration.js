var app = angular.module('eventRegistration', []);

app.controller('RegistrationController', function($scope) {
  $scope.registration = {};

  $scope.submitForm = function() {
    console.log('Form submitted:', $scope.registration);
  };
});