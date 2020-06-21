/**
 * Variables and datatypes
 */

/*
var firstName = 'John';
console.log(firstName);

var lastName = 'Smith';
var age = 28;

var fullAge = true;
console.log(fullAge);

var job;
console.log(job);

job = "teacher";
console.log(job);

// Variable nameing rules
var _3years = 3;
var MarkJohn = 'Mark and John';
//var if = 'if'; // error
*/

/**
 * Variable mutations and type coercion
 */
/*
var firstName = 'John';
var age = 28;

console.log(firstName + ' ' + age);

var job, isMarried;
job = 'teacher';
isMarried = false;

console.log(firstName + ' is a ' + age + ' year old ' + job + '. Is he married? ' + isMarried);

// Variable mutation
age = 'twenty eight';
job = 'driver';

alert(firstName + ' is a ' + age + ' year old ' + job + '. Is he married? ' + isMarried);

var lastName = prompt('What is his last name? ');
console.log(firstName + ' ' + lastName);
*/

/**
 * Basic Operators
 */
/*
var now, yearJohn, yearMark, ageJohn, ageMark;
now = 2018;
ageJohn = 28;
ageMark = 33;
yearJohn = now - ageJohn;
yearMark = now - ageMark;

console.log(yearJohn);
console.log(yearMark);

console.log(now + 2);
console.log(now * 2);
console.log(now / 10);

// Logical operator
var johnOlder = ageJohn > ageMark;
console.log(johnOlder);

// typeof operator
console.log(typeof johnOlder);
console.log(typeof ageJohn);
console.log(typeof 'Mark is older than John');
var x;
console.log(typeof x);
*/


/**
 * Operator precedence
 */
/*
var now = 2018;
var yearJohn = 1989;
var fullAge = 18;

var isFullAge = now - yearJohn >= fullAge;
console.log(isFullAge);

var ageJohn = now - yearJohn;
var ageMark = 35;
var average = (ageJohn + ageMark) / 2;
console.log(average);

// Multiple assignments
var x, y;
x = y = (3 + 5) * 4 - 6;
console.log(x, y);

// More operators
x *= 2;
console.log(x);
x++;
console.log(x);
*/

/**
 * Conditional statements
 */
/*
var firstName = 'John';
var civilStatus = 'single';

if (civilStatus === 'married') {
    console.log(firstName + ' is married!');
} else {
    console.log(firstName + ' will hopefully will get married soon!');
}

var isMarried = true;

if (isMarried) {
    console.log(firstName + ' is married!');
} else {
    console.log(firstName + ' will hopefully will get married soon!');
}

var marksMass, johnsMass, marksHeight, JohnsHeight;
marksMass = 102;
johnsMass = 78;
marksHeight = 1.79;
johnsHeight = 1.55;

var marksBMI, johnsBMI;
marksBMI = marksMass / (marksHeight * marksHeight);
johnsBMI = johnsMass / (johnsHeight * johnsHeight);

console.log(marksBMI);
console.log(johnsBMI);

if(marksBMI > johnsBMI) {
    console.log('Mark\'s BMI is higher than John\'s')
} else {
    console.log('John\'s BMI is higher than Mark\'s')
}
*/

/**
 * Boolean logic
 */
/*
var firstName = 'John';
var age = 20;

if (age < 13) {
    console.log(firstName + ' is a boy.');
} else if (age >= 13 && age < 20) {
    console.log(firstName + ' is a teenager.');
} else if (age >= 20 && age < 30) {
    console.log(firstName + ' is an young man.');
} else {
    console.log(firstName + ' is a man.');    
}
*/

/**
 * Ternary operator and switch statements
 */
/*
var firstName = 'John';
var age = 16;

age >= 18 ? console.log(firstName + ' may drink beer.') : console.log(firstName + ' can drink juice');
    
var drink = age >= 18 ? 'beer' : 'juice';
console.log(drink);
*/

/*
if (age >= 18) {
    var drink = 'beer';
} else {
    var drink = 'juice';
}
*/

// switch statements
/*
var job = 'instructor';

switch(job) {
    case 'teacher':
    case 'instructor':
        console.log(firstName + ' teaches kids how to code.');
        break;
     case 'driver':
        console.log(firstName + ' drives an Uber in Lisbon.');
        break;
     case 'designer':
        console.log(firstName + ' designs beautiful websites.');
        break;
     default: 
        console.log(firstName +  ' does something else.');
}

var firstName = 'John';
var age = 20;

switch (true) {
    case age < 13:
        console.log(firstName + ' is a boy.');
        break;
    case console.log(firstName + ' is a boy.'):
        console.log(firstName + ' is a teenager.')
        break;
    case age >= 20 && age < 30:
        console.log(firstName + ' is an young man.');
        break; 
    default:
        console.log(firstName + ' is a man.');  
}
*/

/**
 * Truthy and falsy values and equality operators
 */

// falsy values: undefined, null, 0, '', NaN
// truthy values: NOT falsy values
/*
var height ;
height = 23;
if (height || height === 0) {
    console.log('Variable is defined');
} else {
    console.log('Variable has NOT been defined');
}

// Equality operators
if (height == '23') {
    console.log('The == operator does type coercion!');
}
*/

/**
 * Functions
 */
/*
function calculateAge(birthYear) {
    return 2020 - birthYear;
}

var ageJohn = calculateAge(1983);
var ageMike = calculateAge(1948);
var ageJane = calculateAge(1969);
console.log(ageJohn, ageMike, ageJane);

function yearsUntilRetirement(year, firstName)
{
    var age = calculateAge(year);
    var retirement = 65 - age;
    if (retirement > 0) {
        console.log(firstName + ' retires in ' + retirement + ' years.');
    } else {
        console.log(firstName + ' is already retired.');
    }
}

yearsUntilRetirement(1990, 'John');
yearsUntilRetirement(1948, 'Mike');
yearsUntilRetirement(1969, 'Jane');
*/

/**
 * Function statements and Expressions
 */

// function declaration
//function whatDoYouDo(job, firstName) {}

// function expression
/*
var whatDoYouDo = function(job, firstName) {
    switch(job) {
        case 'teacher':
            return firstName + ' teaches kids how to code.';
        case 'driver':
            return firstName + ' rides Uber in Lisbon.';            
        case 'designer':
            return firstName + ' designs beautiful websites.';             
        default:
            return firstName + ' does something else.';
    }
}

console.log(whatDoYouDo('teacher', 'John'));
console.log(whatDoYouDo('designer', 'Jane'));
console.log(whatDoYouDo('retired', 'Mark'));
*/

/**
 * arrays
 */

/*
// Initialize new array
var names = ['John', 'Mark', 'Jane'];
var years = new Array(1990, 1969, 1948);

console.log(names);
console.log(names.length);
console.log(names[0]);

// Mutate array data
names[1] = 'Ben';
// names[5] = 'Mary'; // ["John", "Ben", "Jane", empty × 2, "Mary"]
names[names.length] = 'Mary'; // ["John", "Ben", "Jane", "Mary"]
console.log(names);

// Different data types
var john = ['John', 'Smith', 1990, 'teacher', false];

john.push('blue');
john.unshift('Mr.');
console.log(john);

john.pop();
john.pop();
john.shift();
console.log(john);

console.log(john.indexOf(1990));
console.log(john.indexOf(23)); // -1

console.log(john.indexOf('designer') == -1 ? 'John is not a designer' : 'John is a designer');
*/


/**
 * Objects and properties
 */
/*
 var john = {
     firstName: 'John',
     lastName: 'Smith',
     birthYear: 1990,
     family: ['Jane', 'Mark', 'Bob', 'Emily'],
     job: 'teacher',
     isMarried: false
 };

console.log(john);
console.log(john.firstName);
console.log(john['lastName']);
var x = 'birthYear';
console.log(john[x]);

john.job = 'designer';
john['isMarried'] = true;
console.log(john);

var jane = new Object();
jane.name = 'Jane';
jane.birthYear = 1969;
jane['lastName'] = 'Smith';
console.log(jane);
*/

/**
 * Objects and methods
 */
/*
 var john = {
     firstName: 'John',
     lastName: 'Smith',
     birthYear: 1990,
     family: ['Jane', 'Mark', 'Bob', 'Emily'],
     job: 'teacher',
     isMarried: false,
     calcAge: function() {
         this.age =  2020 - this.birthYear;
     }
 };

console.log(john);
*/

/**
 * Loops and iterations
 */

// for loop
/*
for (var i = 1; i <= 20; i += 2) {
    console.log(i);
}

var john = ['John', 'Smith', 1990, 'designer', false]; 

for (var i = 0; i < john.length; i++) {
    console.log(john[i]);
}

// while loop
var i = 0;
while (i < john.length) {
    console.log(john[i]);
    i++;
}
*/

// continue and break statements
var john = ['John', 'Smith', 1990, 'designer', false]; 

for (var i = 0; i < john.length; i++) {
    if (typeof john[i] !== 'string')
        continue;
    console.log(john[i]);
}

for (var i = 0; i < john.length; i++) {
    if (typeof john[i] !== 'string')
        break;
    console.log(john[i]);
}

// looping backwards
for (var i = john.length-1; i >= 0; i--) {
    console.log(john[i]);
}






































































