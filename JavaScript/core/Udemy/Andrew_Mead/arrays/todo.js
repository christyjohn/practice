const todos = [{
    task: 'Order cat food',
    completed: true
}, {
    task: 'Cycle 10 kms',
    completed: false
}, {
    task: 'Get a new office chair',
    completed: false
}, {
    task: 'Buy food',
    completed: false
}, {
    task: 'Clean kitchen',
    completed: true
}, {
    task: 'Email the office memo',
    completed: false
}]


const deleteTodo = function(todos, task) {
    const index = todos.findIndex(function(todoTask, index) {
        return todoTask.task.toLowerCase() === task.toLowerCase()
    })

    if (index > -1) {
        todos.splice(index, 1)
    } 
}

console.log('Before delete')
console.log(todos)
console.log('------------------')

deleteTodo(todos, 'buy food')

console.log('After delete')
console.log(todos)
console.log('------------------')


/* let showArrayContents = function() {
    todos.forEach(function(item, index) {
        console.log(`${index + 1}. ${item}.`)
    })
}

console.log(`You have ${todos.length} todos!`)
console.log(todos)
console.log('-----------------------------------')

console.log('Removing item at 3rd position')
todos.splice(2, 1)
showArrayContents()
console.log('-----------------------------------')
console.log('Replacing item at end position')
todos.splice(todos.length-1, 1, 'Wash the car')
showArrayContents()
console.log('-----------------------------------')
console.log('Removing item at first position')
todos.shift()
showArrayContents()
console.log('-----------------------------------')
console.log('Add an item at last position')
todos.push('Do workout')
showArrayContents()
console.log('-----------------------------------') */
