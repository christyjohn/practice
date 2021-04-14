const account = {
    name: 'Christy John',
    income: [],
    expenses: [],    
    addIncome: function(description, amount) {
        this.income.push({
            description: description,
            amount: amount
        })
    },
    addExpense: function(descriptiom, amount) {
        this.expenses.push({
            descriptiom: descriptiom, 
            amount: amount
        })
    },
    getAccountSummary: function() {
        let totalExpense = 0
        let totalIncome = 0
        this.income.forEach(function(income) {
            totalIncome += income.amount
        })
        this.expenses.forEach(function(expense) {
            totalExpense += expense.amount
        })
        let balance = totalIncome - totalExpense
        return `${this.name} has $${balance}. $${totalIncome} in income. $${totalExpense} in expenses.`
    }
}

account.addIncome('Salary', 1000)
account.addIncome('Side project', 350)
account.addExpense('Rent', 950)
account.addExpense('Coffee', 2)
console.log(account)
console.log('------------------------------')
console.log(account.getAccountSummary())