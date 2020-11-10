//console.log('Hello World!!!');

/*********************
* Variables and data types
*/
var firstName = 'Christy';
console.log(firstName);

var lastName = 'John';
var age = 38;

var legalAge = true;
console.log(legalAge);

var job, married;
console.log(job);

job = "Programmer";
console.log(job);

// Variable naming rules
var _3years = 3;
var johnMark = 'John and Mark';

/*********************
* Variable mutation and type coercion
*/

// Type coercion
console.log(firstName + ' '  + age);
job = 'Driver';
isMarried = false;

console.log(firstName + ' is a ' + age + ' year old ' 
            + job + '. Is he married? ' + isMarried);

// Variable mutation
age = 'twenty eight';

alert(firstName + ' is a ' + age + ' year old ' 
            + job + '. Is he married? ' + isMarried);

lastName = prompt('What is his last Name?');
console.log (firstName + ' ' + lastName);