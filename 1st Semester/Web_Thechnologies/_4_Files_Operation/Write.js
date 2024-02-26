var fs = require('fs');
fs.writeFile('data2.txt', 'Hi! Rohit', function (err) {
if (err)
console.log(err);
else
console.log('Write operation complete');
});