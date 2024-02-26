const fs = require('fs');

// File path
const filePath = 'example.txt';

// Create a file
fs.writeFile(filePath, 'Hello, Node.js!', (err) => {
    if (err) {
        console.error('Error creating file:', err);
    } else {
        console.log('File created successfully.');

        // Read the file
        fs.readFile(filePath, 'utf8', (err, data) => {
            if (err) {
                console.error('Error reading file:', err);
            } else {
                console.log('File content:', data);

                // Append to the file
                fs.appendFile(filePath, '\nAppended text!', (err) => {
                    if (err) {
                        console.error('Error appending to file:', err);
                    } else {
                        console.log('Text appended to file.');

                        // Read the updated file
                        fs.readFile(filePath, 'utf8', (err, updatedData) => {
                            if (err) {
                                console.error('Error reading updated file:', err);
                            } else {
                                console.log('Updated file content:', updatedData);

                                // Delete the file
                                fs.unlink(filePath, (err) => {
                                    if (err) {
                                        console.error('Error deleting file:', err);
                                    } else {
                                        console.log('File deleted successfully.');
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
});
