package com.mycompany.myapp.homework1

class ExtendedPerson(name: String, age: Int) : Person(name, age) {
    fun lifeStage(): String {
        return when (age) {
            in 0..12 -> "$name is Child"
            in 13..19 -> "$name is Teenager"
            else -> "$name is Adult"
        }
    }
}