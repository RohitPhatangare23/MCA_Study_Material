var i = 0;
var interval = setInterval(function () {
  i = i + 1;
  console.log("Hello World at " + 2 * i + " seconds");
  if (i == 5) {
    clearInterval(interval);
  }
}, 2000);
var interval1 = setInterval(function () {
  console.log("Hello World");
}, 2000);
setTimeout(function () {
  clearInterval(interval1);
}, 10000);
