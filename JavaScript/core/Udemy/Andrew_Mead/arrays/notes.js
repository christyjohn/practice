const notes = [{
    title: 'My next trip',
    body: 'I would like to go to Spain'
}, {
    title: 'Habits to work on',
    body: 'Exercise. Eating a bit better.'
}, {
    title: 'Office modification',
    body: 'Get a new seat'
}]

const findNote = function (notes, noteTitle) {
    return notes.find(function(note, index) {
        return note.title.toLowerCase() == noteTitle.toLowerCase()
    })
}

const findNotes = function(notes, query) {    
    return notes.filter(function (note, index) {
        const isTitleMatch = note.title.toLowerCase().includes(query.toLowerCase())
        const isBodyMatch = note.body.toLowerCase().includes(query.toLowerCase())
        return isTitleMatch || isBodyMatch
    })
}


console.log(findNotes(notes, 'work'))

/* const findNote = function (notes, noteTitle) {
    const index = notes.findIndex(function(note, index) {
        return note.title.toLowerCase() == noteTitle.toLowerCase()
    })
    return notes[index]
}
 */
const note = findNote(notes, 'another Office modification')
console.log(note)

/* console.log(notes.length)
console.log(notes)

const index = notes.findIndex(function (note, index) {
    return note.title === 'Habits to work on'
})

console.log(index) */

// console.log(notes)
// console.log(notes[0])
// console.log(notes.length)
// console.log(notes[notes.length - 1] )

// console.log(notes.pop())
// notes.push('My New Note at end')
// console.log(notes)
    
// console.log(notes.shift())
// notes.unshift('My First Note')
// console.log(notes)

/* console.log(notes)
notes.splice(1, 0)
console.log(notes.length)
console.log(notes)
notes.splice(1, 1, {title: 'New title', body: 'This is adding a new note at the second position'})
console.log(notes.length)
console.log(notes)

console.log()
console.log('-----------------------')
console.log()

notes.forEach(function(item, index) {
    console.log(index)
    console.log(item)
})

// let someObject = {}
// let otherObject = someObject

// console.log({} === {})

console.log()
console.log('-----------------------')
console.log() */



