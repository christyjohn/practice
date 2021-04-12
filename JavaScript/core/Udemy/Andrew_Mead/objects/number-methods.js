let num = 103.6789

console.log(num.toFixed(2))
console.log(Math.round(num))
console.log(Math.floor(num))
console.log(Math.ceil(num))

let max = 20
let min = 10
let randonNumber = Math.floor(Math.random() * (max - min + 1))
console.log(randonNumber)

let makeGuess = function(guess) {
    let num =  Math.floor(Math.random() * (max - min + 1))
    console.log(`Random number: ${num}`)

    if (guess === num)
        return true;
    else
        return false;
}

console.log(makeGuess(5))