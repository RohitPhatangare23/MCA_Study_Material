var app = angular.module('collegeAdmission', []);

app.controller('AdmissionController', function($scope) {
  $scope.students = [];

  $scope.submitForm = function() {
    if ($scope.admissionForm.$valid) {
      $scope.students.push($scope.student);
      $scope.student = {}; // reset form
    }
  };
});