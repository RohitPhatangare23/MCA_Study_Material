var fs = require('fs');
console.log('here we are begin');
console.log('this is start point of application');
var content = fs.readFileSync('data.txt');
console.log(content.toString());
console.log('all actions completed');