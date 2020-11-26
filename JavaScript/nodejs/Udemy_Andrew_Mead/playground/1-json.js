const fs = require('fs')

const dataBuffer = fs.readFileSync('1-json.json');
const dataJSON = dataBuffer.toString();
const data = JSON.parse(dataJSON);

data.name = 'Christy';
data.age = '39';

const userJSON = JSON.stringify(data);
fs.writeFileSync('1-json.json', userJSON);

