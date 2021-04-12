let myBook = {
    title: '1984',
    author: 'George Orwell',
    pageCount: 326
}

let otherBook = {
    title: 'A Peoples History',
    author: 'Howard Zinn',
    pageCount: 723
}

let getSumary = function(book) {
    return {
        summary: `${book.title} by ${book.author}`,
        pageCountSummary: `${book.title} is ${book.pageCount} pages long.`
    }
}

let myBookSummary = getSumary(myBook)
let otherBookSummary = getSumary(otherBook)

console.log(myBookSummary.pageCountSummary)
console.log(otherBookSummary.pageCountSummary)

// Challenge area
// Create function - take fahrenheit in and return an object containing Fahrenheit and corresponding Celsius and Kelvin

let convertTemp = function(fahrenheit) {
    let celsius = (fahrenheit - 32) * 5 / 9
    let kelvin = (fahrenheit + 459.67) * 5 / 9

    return {
        fahrenheit: fahrenheit,
        celsius: celsius,
        kelvin: kelvin
    }
}

let fahrenheit = 32
let convertedTemps = convertTemp(fahrenheit)
console.log(convertedTemps)
console.log(`${convertedTemps.fahrenheit} degrees Fahrenheit is ${convertedTemps.celsius} degrees Celsius and \
${convertedTemps.kelvin} degrees Kelvin`)