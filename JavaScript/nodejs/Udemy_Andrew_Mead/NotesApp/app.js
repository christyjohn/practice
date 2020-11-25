const validator = require('validator');
const chalk = require('chalk');
const getNotes = require('./notes.js');

const msg = getNotes();
console.log(msg);

console.log(validator.isEmail('christy@example.com'));
console.log(validator.isURL('https//christy.io'));
console.log(chalk.bold.red('Error'));
