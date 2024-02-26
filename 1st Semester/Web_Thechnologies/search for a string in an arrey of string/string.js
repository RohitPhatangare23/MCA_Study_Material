const { EventEmitter } = require('events');

class StringArrayManager extends EventEmitter {
  constructor(strings) {
    super();
    this.strings = strings;
  }

  sort() {
    this.strings.sort();
    this.emit('sorted', this.strings);
  }

  search(query) {
    const results = this.strings.filter(str => str.includes(query));
    this.emit('searched', results);
  }
}

const strings = ['apple', 'banana', 'cherry', 'date', 'fig', 'grape'];
const manager = new StringArrayManager(strings);

manager.on('sorted', sortedStrings => {
  console.log('Sorted strings:', sortedStrings);
});

manager.on('searched', (results, query) => {
  console.log(`Search results for "${query}":`, results);
});

manager.sort();
manager.search('a');