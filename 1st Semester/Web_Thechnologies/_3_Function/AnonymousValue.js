var middlename = "RAOSAHEB";
let myname = { firstname: "ROHIT", lastname: "PHATANGARE" };

(function () {
  console.log(myname.firstname, middlename, myname.lastname);
  console.log("This is Hiray College");
})(myname);
//console.log(middlename)
setTimeout(function () {
  console.log("it Get Execute After 5 Seconds");
}, 5000);
