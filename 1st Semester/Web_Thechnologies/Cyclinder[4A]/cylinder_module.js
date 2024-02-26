// cylinderModule.js

angular.module('CylinderModule', [])
    .service('CylinderService', function () {
        this.calculateSurfaceArea = function (radius, height) {
            if (radius <= 0 || height <= 0) {
                throw new Error("Radius and height must be positive values.");
            }

            // Surface area formula: 2πr² + 2πrh
            var baseArea = 2 * Math.PI * Math.pow(radius, 2);
            var lateralArea = 2 * Math.PI * radius * height;
            return baseArea + lateralArea;
        };

        this.calculateVolume = function (radius, height) {
            if (radius <= 0 || height <= 0) {
                throw new Error("Radius and height must be positive values.");
            }

            // Volume formula: πr²h
            return Math.PI * Math.pow(radius, 2) * height;
        };
    });
