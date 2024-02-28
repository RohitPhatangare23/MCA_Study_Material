const calculateArea = (radius) => {
    return Math.PI * Math.pow(radius, 2);
};
const calculatePerimeter = (radius) => {
    return 2 * Math.PI * radius;
};
module.exports = {
    calculateArea,
    calculatePerimeter
};
