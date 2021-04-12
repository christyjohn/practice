let myAccount = {
    name: 'Christy',
    expenses: 0,
    income: 0
}

let friendsAccount = {
    name: 'Tobby',
    expenses: 0,
    income: 0
}

let otherAccount = myAccount
otherAccount.income = 1000

console.log(myAccount)

let addIncome = function(account, amount) {
    account.income += amount
}

let addExpense = function(account, amount) {
    account.expenses += amount
    account = {}
    console.log(account)
}

let resetAccount = function(account) {
    account.income = 0
    account.expenses = 0
}

let getAccountSummary = function(account) {
    let name = account.name
    let income = account.income
    let expenses = account.expenses
    let balance = income - expenses

    return `Account for ${name} has $${balance}. $${income} in income. $${expenses} in expenses.`
}

addExpense(myAccount, 2.50)
addExpense(otherAccount, 7.50)
console.log(myAccount)

console.log(getAccountSummary(myAccount))

addIncome(friendsAccount, 2000)
addExpense(friendsAccount, 20.5)
addExpense(friendsAccount, 45.78)

console.log(getAccountSummary(friendsAccount))
resetAccount(myAccount)
console.log(getAccountSummary(myAccount))