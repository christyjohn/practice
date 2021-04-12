// Undefine for variable
let name 

name = 'Jen'

if (name === undefined) {
    console.log('Please provide a name')
} else {
    console.log(name)
}

// Undefined for function arguments
let printNum = function(num) {
    console.log(num)
}

printNum()

let result = printNum()
console.log(result)

// null as assigned value
let age = 27
age = null
console.log(age)