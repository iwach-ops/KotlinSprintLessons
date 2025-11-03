package org.example.app.lesson_2

fun main() {
    val numberOfEmployees: Int = 50
    val employeeSalary: Int = 30000
    val numberOfInterns: Int = 30
    val internSalary: Int = 20000

    val employeeSalaryCosts: Int = employeeSalary * numberOfEmployees
    val internsSalaryCosts: Int = internSalary * numberOfInterns
    val allSalaryCosts: Int = employeeSalaryCosts + internsSalaryCosts
    val allAverageSalary: Int = allSalaryCosts / (numberOfEmployees + numberOfInterns)

    println("Employee salary costs: $employeeSalaryCosts")
    println("All salary costs: $allSalaryCosts")
    println("All average salary: $allAverageSalary")
}