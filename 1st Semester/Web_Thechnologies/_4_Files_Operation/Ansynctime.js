const message = function () {
    console.log("Hello I am Rohit Phatangare");
    }
    setTimeout(message, 3000);
    setTimeout(() => {
    console.log("We are calling you first")
    }, 2000);