/**
 * Hoisting
 */

/*
// functions
calculateAge(1965);

function calculateAge(year) {
    console.log(2020 - year);
}

// retirement(1990); // will not work
// hoisting only works for function declaration but not for function expression

var retirement = function(year) {
    console.log(65 - (2020 - year));
}

retirement(1990); // will work

// variables
//console.log(age); // hoisting will not work for variables
age = 23;
console.log(age);

function foo() {
    // console.log(age); // undefined
    var age = 65;
    console.log(age);
}

foo();
console.log(age);
*/

/**
 * Scoping
 */
/*
// First scoping example
var a  = 'Hello!';
first();

function first() {
    var b = 'Hi!';
    second();
    
    function second() {
        var c = 'Hey!';
        console.log(a + b + c);
        third();
    }
}

function third() {
    var d = 'John';
    // console.log(a + b + c);    // Uncaught ReferenceError:b is not defined
    console.log(a + d);
}
*/

/**
 * this keyword
 */
//console.log(this);
calculateAge(1983);

function calculateAge(year) {
    console.log(2020 - year);
    console.log(this);
}

var john = {
    name: 'John',
    yearOfBirth: 1990,
    calculateAge: function() {
        console.log(this);
        console.log(2020 - this.yearOfBirth);        
        
        /*
        function innerFunction() {
            console.log(this);
        }
        innerFunction();
        */
    }
    
};

john.calculateAge();

var mike = {
     name: 'Mike',
    yearOfBirth: 1984
};

mike.calculateAge = john.calculateAge;
mike.calculateAge();
































