var events = require('events')
var emitter = new events.EventEmitter()
emitter.on('saved', (arg) => {
console.log(`A saved event occurred: number1 :${arg.n1}, number2 : ${arg.n2}`);
})
emitter.emit('saved', {
n1: '10',
n2: '20'
})