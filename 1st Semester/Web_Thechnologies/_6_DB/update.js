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
    "UPDATE STUDENT SET STUDENT_NAME='SURAJKUMAR',STUDENT_EMAILID='surajkumar@gmail.com' WHERE STUDENT_ID=2",
    function (err, result) {
      if (err) throw err;
      console.log("Record Updated");
    }
  );
});
