'use strict';

/*
function calcAge(birthYear) {
  const age = 2037 - birthYear;

  function printAge() {
    const output = `${firstName}, you are ${age}, born in ${birthYear}`;
    console.log(output);

    if (birthYear >= 1981 && birthYear <= 1996) {
      var millenial = true;
      const firstName = 'Cecil';
      const str = `Oh, you're a millenial, ${firstName}`;
      console.log(str);

      function add(a, b) {
        return a + b;
      }
    }

    console.log(millenial);
    // console.log(add(2, 3)); // will work in non-strict modes
  }

  printAge();

  return age;
}

const firstName = 'Christy';
calcAge(1983);
*/

// hoisting
// variables
console.log(me);
//console.log(job);
//console.log(year);

var me = 'Christy';
let job = 'teacher';
const year = 1991;

// functions

console.log(addDecl(2, 3));
//console.log(addExpr(2, 3));
//console.log(addArrow(2, 3));

function addDecl(a, b) {
  return a + b;
}

const addExpr = function (a, b) {
  return a + b;
};

var addArrow = (a, b) => a + b;
