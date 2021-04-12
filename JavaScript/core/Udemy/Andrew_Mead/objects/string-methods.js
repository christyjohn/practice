let name = ' Christy John '

// Length property
console.log(name.length)

// Convert to upper case
console.log(name.toUpperCase())

// Convert to lower case
console.log(name.toLowerCase())

// check if a substring is present in string
console.log(name.includes('is'))

// trim
console.log(name.trim())

// challenge
// isValidPassword
// length is more than 8 - and it doesn't contain the word password

let isValidPassword = function(password) {
    return ((password.length > 8) && (!password.includes('password')))
}

console.log(isValidPassword('absd'))
console.log(isValidPassword('absd@213&*&'))
console.log(isValidPassword('asdpassword#45nk%'))