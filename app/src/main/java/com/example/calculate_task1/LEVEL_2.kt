package com.example.calculate_task1


class Calculatorr {
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun modulus(num1: Int, num2: Int) :Int {
        return  num1 % num2
    }
}

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    println("원하는 연산을 선택 : +, -, *, /, %")
    val operation = readLine()

    val calculator = Calculatorr () // calculatr 클래스의 인스턴스를 생성

    if (operation == "+") {
        var plusResult = calculator.plus(num1, num2)
        println(" '+' 한 값은 ${plusResult}")
    }
    else if (operation == "-") {
        var minusResult = calculator.minus(num1, num2)
        println(" '-' 한 값은 ${minusResult} 입니다")
    }
    else if (operation == "*") {
        var multpleResult = calculator.multiply(num1, num2)
        println("'*' 한 값은 ${multpleResult}")
    }
    else if (operation == "/") {
        var divideResult = calculator.divide(num1, num2)
        println(" '/' 한 값은 ${divideResult}")
    }
    else if (operation == "%") {
        val modResult = num1 % num2
        println(" 두 수의 나머지 연산은 ${modResult}")
    }

    else {
        println("오류 오류 오류")
    }
}