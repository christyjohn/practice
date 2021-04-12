let convertFahrenheitToCelsius = function(temp) {
    let celsius =  (temp - 32) * 5 / 9;

    if (celsius <= 0) {
        let isFreezing = true;
    }
    
    return celsius;
}

console.log('32 degree Fahrenheit is ' + convertFahrenheitToCelsius(32) + ' degree Celsius')
console.log('68 degree Fahrenheit is ' + convertFahrenheitToCelsius(68) + ' degree Celsius')