package com.example.calculate_task1


abstract class Operation1 {
    abstract fun operate(num1: Int, num2: Int) : Int
}
class Calculator(val operation: Operation1) {
    fun calculate(num1: Int, num2: Int): Int {
        return operation.operate(num1, num2)
    }
}

class AddOperation : Operation1() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}


class  SubstractOpertaion : Operation1() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MultiplyOperation : Operation1() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class  DivideOperation :  Operation1() {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    println("원하는 연산 선택 : +, -, *, /, %")
    val operation = readLine()

    if (operation == "+") {
        val calculator = Calculator(AddOperation())
        val result = calculator.calculate(num1, num2)
        println("답은 : ${result}")
    }
    if (operation == "-") {
        val calculator = Calculator(SubstractOpertaion())
        val result = calculator.calculate(num1, num2)
        println("답은 : ${result}")
    }
    if (operation == "*") {
        val calculator = Calculator(MultiplyOperation())
        val result = calculator.calculate(num1, num2)
        println("답은 : ${result}")
    }
    if (operation == "/") {
        val calculator = Calculator(DivideOperation())
        val result = calculator.calculate(num1, num2)
        println("답은 : ${result}")
    }
}