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
  con.query(
    "UPDATE info SET STUDENT_NAME='Surya',STUDENT_ADDRESS='Kashmir' WHERE STUDENT_ROLLNO=2",
    function (err, result) {
      if (err) throw err;
      console.log("Record Updated");
    }
  );
});
