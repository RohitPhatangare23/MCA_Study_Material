const circleModule = require('./circlemodule');
const radius = 5;
const area = circleModule.calculateArea(radius);
console.log(`Area of the circle with radius ${radius} : ${area.toFixed(2)}`);
const perimeter = circleModule.calculatePerimeter(radius);
console.log(`Perimeter of the circle with radius ${radius} : ${perimeter.toFixed(2)}`);
