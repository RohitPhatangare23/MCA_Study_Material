var events = require('events');
var emitter = new events.EventEmitter();
//listening to event 
emitter.on('eventname', () => {
console.log('event get fired');
})
//event fired
emitter.emit('eventname');