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

  var createTableQuery =
    "CREATE TABLE STUDENT (" +
    "STUDENT_ID INT(10)," +
    "STUDENT_NAME VARCHAR(20)," +
    "STUDENT_EMAILID VARCHAR(100)," +
    "STUDENT_MOBNO INT(15)" +
    ")";

  con.query(createTableQuery, function (err, result) {
    if (err) throw err;
    console.log("TABLE CREATED");
  });
});
