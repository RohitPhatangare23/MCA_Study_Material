
//creating object of http
var http = require('http');
const server = http.createServer((req, res) => {
if (req.url === '/') //===means strict comparision between two value
{
res.write('Hello Everybody,Rohit Here');
res.end();
}
});
server.listen(5000);
console.log('your http running properly');