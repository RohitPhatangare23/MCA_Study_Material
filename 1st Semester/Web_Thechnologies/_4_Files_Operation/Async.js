var fs = require('fs');
console.log('here we are begin');
console.log('this is start point of application');
var content = fs.readFile('C:\\Users\\rohit\\OneDrive\\Desktop\\WEB_TECH\\_4_Files_Operation\\data.txt', function(err, data) {
if (err) throw err;
console.log(data.toString());
})
console.log('all actions completed');