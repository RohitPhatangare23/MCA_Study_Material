// app.js

angular.module('CylinderApp', ['CylinderModule'])
    .controller('CylinderController', function ($scope, CylinderService) {
        $scope.calculateSurfaceArea = function () {
            try {
                $scope.resultSurfaceArea = CylinderService.calculateSurfaceArea($scope.radius, $scope.height);
                $scope.resultVolume = null;
                $scope.error = null;
            } catch (e) {
                $scope.error = e.message;
                $scope.resultSurfaceArea = null;
                $scope.resultVolume = null;
            }
        };

        $scope.calculateVolume = function () {
            try {
                $scope.resultVolume = CylinderService.calculateVolume($scope.radius, $scope.height);
                $scope.resultSurfaceArea = null;
                $scope.error = null;
            } catch (e) {
                $scope.error = e.message;
                $scope.resultSurfaceArea = null;
                $scope.resultVolume = null;
            }
        };
    });
