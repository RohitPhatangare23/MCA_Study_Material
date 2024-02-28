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

  var createTableQuery =
    "CREATE TABLE info (" +
    "STUDENT_ROLLNO INT(10)," +
    "STUDENT_NAME VARCHAR(20)," +
    "STUDENT_ADDRESS VARCHAR(15)" +
    ")";

  con.query(createTableQuery, function (err, result) {
    if (err) throw err;
    console.log("TABLE CREATED");
  });
});
