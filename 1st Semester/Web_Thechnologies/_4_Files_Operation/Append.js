var fs = require('fs')
fs.appendFile('data.txt', 'this is second appended version!', function (err) {
if (err)
console.log(err);
console.log("Append Completed")
});