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
    "DELETE FROM info WHERE STUDENT_ROLLNO IN (2,4)",
    function (err, result) {
      if (err) throw err;
      console.log("Record Deleted");
    }
  );
});
