const EventEmitter = require('events');

const emitter = new EventEmitter();

const characters = ['A', 'C', 'B', 'E', 'D'];

const sortCharacters = () => {
  characters.sort();
  console.log('Sorted characters:', characters);
  emitter.emit('sorted');
};

const searchCharacter = (char) => {
  const index = characters.indexOf(char);
  if (index !== -1) {
    console.log(`Character "${char}" found at index ${index}`);
  } else {
    console.log(`Character "${char}" not found`);
  }
  emitter.emit('searched');
};

emitter.on('sorted', () => {
  console.log('Sorted event triggered');
});

emitter.on('searched', () => {
  console.log('Searched event triggered');
});

sortCharacters();
searchCharacter('B');
characters.sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0));
characters.sort((a, b) => {
    if (a.property1 < b.property1) return -1;
    if (a.property1 > b.property1) return 1;
    if (a.property2 < b.property2) return -1;
    if (a.property2 > b.property2) return 1;
    return 0;
  });