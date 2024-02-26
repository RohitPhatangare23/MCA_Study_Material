var fs = require('fs');
fs.readFile('C:\\Users\\rohit\\OneDrive\\Desktop\\WEB_TECH\\_4_Files_Operation\\data.txt', function
(err, data) {
if (err) throw err;
console.log(data.toString());
})