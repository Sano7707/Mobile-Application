package com.mycompany.myapp.homework1


import java.text.SimpleDateFormat
import java.util.Date

fun main(){
    //Exercise 1
  val array = arrayOf(1,4,9,16,25,36)
  val list = listOf(1,8,27,64,125,216)

  println("Items of array")
    for(item in array){
      print("$item ")
  }
    println()
    println("Items of list")
    for(item in list){
        print("$item ")
    }

  println()
  println()
  //Exercise 2
    var myString = "Hello World";
    myString +=  " from Kotlin ";
    myString += myString.substring(0,5)
    myString += myString.substring(0,5).uppercase() +
            " " + myString.substring(0,5).lowercase()
    println(myString)

  println()
  //Exercise 3
  val myMap = mapOf("Calculus" to "A", "Linear Algebra" to "A-","Discrete" to "B",
    "Intro to CS" to "B+", "Mobile Application Development" to "A+")
  for (entry in myMap.entries){
    print("Key is " + entry.key + " Value is " + entry.value)
    println()
  }

  println()
  //Exercise4
  println( isPositive(1))
  println(isPositive(0))
  println(isPositive(-1))

  println()
  //Exercise 5
  greeting()

  println()
  //Exercise 6
  carefulDivision(5,2)
  carefulDivision(5,0)

  println()
  //Exercise 7
  val currentDate = Date()
  val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  val formattedDateTime = formatter.format(currentDate)
  println("Current Date and Time: $formattedDateTime")

  println()
  //Exercise 8
  val person = Person("Sano",21)
  println("Person's name is ${person.name}")
  println("Person's age is ${person.age}")

  println()
  //Exercise 9
  val extendedPerson = ExtendedPerson("Sano",21)
  println(extendedPerson.lifeStage())

  println()
  //Exercise 10
  val myList =  (1..10).toList()
  println(myList.filter { it % 2 == 0 })
}

fun isPositive(integer: Int) : String {
  return if(integer > 0) "$integer is positive"  else if(integer == 0 )
    "$integer is zero" else "$integer is negative"
}

fun greeting(){
  println("Enter your name: ")
  val name = readln()
  println("Enter your age: ")
  val age = readln().toInt()
  println("Hi $name , you are $age years old.")
}

fun carefulDivision(num1 : Int, num2:Int) {
  try{
    if(num2 == 0) {
      val result = num1 / num2
    }
    else{
      println("$num1 / $num2 is ${num1.toDouble()/num2}")
    }
  }
  catch (e : ArithmeticException){
    println(e.message)
  }
}
