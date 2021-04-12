// Function - input, code, output (return value)

let greetUser = function() {
    console.log('Welcome user!')
}

greetUser()
greetUser()
greetUser()

let square = function(num) {
    let result = num * num
    return result
}

console.log(square(3))
console.log(square(10))

// challenge
let convertFahrenheitToCelsius = function(temp) {
    return (temp - 32) * 5 / 9;
}

console.log('32 degree Fahrenheit is ' + convertFahrenheitToCelsius(32) + ' degree Celsius')
console.log('68 degree Fahrenheit is ' + convertFahrenheitToCelsius(68) + ' degree Celsius')