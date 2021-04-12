let calculateGrade = function(student_score, total_possible_score) {
    percent = student_score / total_possible_score * 100
    let grade = 'A'

    if (percent >= 80 && percent < 89) {
        grade = 'B'
    } else if (percent >= 70 && percent < 79) {
        grade = 'C'
    } else if (percent >= 60 && percent < 69) {
        grade = 'D'
    } else if (percent >= 50 && percent < 59) {
        grade = 'E'
    } else if (percent >= 0 && percent < 49) {
        grade = 'F'
    }

    return `You scored ${student_score} out of ${total_possible_score}. You scored ${percent}% and your grade is ${grade}.`
}

console.log(calculateGrade(98, 100))
console.log(calculateGrade(85, 100))
console.log(calculateGrade(70, 100))
console.log(calculateGrade(67, 100))
console.log(calculateGrade(56, 100))
console.log(calculateGrade(08, 100))
console.log('----------------------')
console.log(calculateGrade(198, 200))
console.log(calculateGrade(85, 200))
console.log(calculateGrade(120, 200))
console.log(calculateGrade(67, 200))
console.log(calculateGrade(156, 200))
console.log(calculateGrade(08, 200))