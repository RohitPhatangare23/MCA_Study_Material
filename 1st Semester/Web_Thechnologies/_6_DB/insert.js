var mysql = require("mysql");
var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "",
  database: "mydb",
});
con.connect(function (err) {
  if (err) throw err;
  console.log("Connected");
  var sql =
    "INSERT INTO student (STUDENT_ID,STUDENT_NAME,STUDENT_EMAILID,STUDENT_MOBNO) VALUES ?";
  var values = [
    [1, "ROHIT", "rohit@gmail.com", 11111],
    [2, "SURAJ", "suraj@gmail.com", 22222],
    [3, "OM", "om@gmail.com", 33333],
    [4, "AJIT", "ajit@gmail.com", 44444],
    [5, "LAXMIKANT", "laxmikant@gmail.com", 55555],
  ];
  con.query(sql, [values], function (err, result) {
    if (err) throw err;
    console.log("Numbers of record inserted: " + result.affectedRows);
  });
});
