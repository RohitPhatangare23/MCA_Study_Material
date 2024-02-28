var mysql = require("mysql");
var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "",
  database: "student",
});
con.connect(function (err) {
  if (err) throw err;
  console.log("Connected");
  var sql =
    "INSERT INTO info (STUDENT_ROLLNO,STUDENT_NAME,STUDENT_ADDRESS) VALUES ?";
  var values = [
    [1, "ROHIT", "Dahanu"],
    [2, "SURAJ", "Mumbai"],
    [3, "Ankit", "Pune"],
    [4, "Devank", "Kurla"],
    [5, "Yash", "Kalyan"],
    [6, "Shreyash", "Chiplunyan"],
    [7, "Mukesh", "Kerla"],
    [8, "Yuva", "UP"],
    [9, "Saburi", "Bihar"],
    [10, "Bhuvan", "Delhi"],
    
  ];
  con.query(sql, [values], function (err, result) {
    if (err) throw err;
    console.log("Numbers of record inserted: " + result.affectedRows);
  });
});
