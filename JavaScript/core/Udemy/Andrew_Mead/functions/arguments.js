// Multiple arguments
let add = function (a, b, c) {
    return a + b + c 
}

let result = add(10, 1, 5)
console.log(result)

// Default arguments
let getScoreText = function(name = 'Anonymous', score = 0) {
    return 'Name: ' + name + ' - Score: ' + score
}

let scoreText = getScoreText('Christy')
console.log(scoreText)
scoreText = getScoreText(undefined, 99)
console.log(scoreText)

// Challenge
let getTip = function(total, tipPercent = 0.2) {
    return `A ${tipPercent * 100}% tip on ${total} would be ${total * tipPercent}`
}

let tip = getTip(100)
console.log(tip)
tip = getTip(100, .25)
console.log(tip)

// Template String
let name = 'Jen'
let age = '12'
console.log(`Hey, my name is ${name}! I am ${age} years old.`)
