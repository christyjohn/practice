/**
 * Coding challenge 1
 */

/*

Mark and John are trying to compare their BMI (Body Mass Index), which is calculated using the formula: BMI = mass / height ^ 2 = mass * height * height (mass in kg and height in meter).

1. Store Mark's and John's mass and height in variables.
2. Calculate both their BMIs.
3. Create a boolean variable containing information whether Mark has higher BMI than John.
4.Print a string to the console containing the variable from step 3. Something like "Is Mark's BMI higher than John's? true".

*/

var marksMass, johnsMass, marksHeight, JohnsHeight;
marksMass = 102;
johnsMass = 78;
marksHeight = 1.79;
johnsHeight = 1.55;

var marksBMI, johnsBMI;
marksBMI = marksMass / (marksHeight * marksHeight);
johnsBMI = johnsMass / (johnsHeight * johnsHeight);
var marksBmiHigher = marksBMI > johnsBMI;

console.log(marksBMI);
console.log(johnsBMI);
console.log('Is Mark\'s BMI higher than John\'s? ' + marksBmiHigher);