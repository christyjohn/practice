const todos = [{
    description: 'Order cat food',
    completed: true
}, {
    description: 'Cycle 10 kms',
    completed: false
}, {
    description: 'Get a new office chair',
    completed: false
}, {
    description: 'Buy food',
    completed: false
}, {
    description: 'Clean kitchen',
    completed: true
}, {
    description: 'Email the office memo',
    completed: false
}]

const inCompleteTodos = todos.filter(function(todo) {
    return !todo.completed
})

const summary = document.createElement('h2')
summary.textContent = `You have ${inCompleteTodos.length} tasks left.`
document.querySelector('body').appendChild(summary)

todos.forEach(function(todo) {
    const p = document.createElement('p')
    p.textContent = todo.description
    document.querySelector('body').appendChild(p)
})

/* const ps = document.querySelectorAll('p')

ps.forEach(function(p) {
    if(p.textContent.includes('the')) {
        p.remove()
    }
}) */