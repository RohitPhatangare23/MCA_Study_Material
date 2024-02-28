let count = 0;
const printHello = () => {
    console.log("Hello");
    count++;
    if (count === 10) {
        clearInterval(intervalId);
    }
};
const intervalId = setInterval(printHello, 500);
setTimeout(() => {
    clearInterval(intervalId);
}, 5000);
