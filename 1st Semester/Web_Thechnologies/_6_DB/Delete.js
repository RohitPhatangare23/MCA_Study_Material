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
  con.query(
    "DELETE FROM STUDENT WHERE STUDENT_ID IN (2,4)",
    function (err, result) {
      if (err) throw err;
      console.log("Record Deleted");
    }
  );
});
