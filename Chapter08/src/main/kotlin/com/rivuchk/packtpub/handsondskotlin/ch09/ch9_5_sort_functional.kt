package com.rivuchk.packtpub.handsondskotlin.ch09

import java.util.*
import kotlin.Comparator


fun main(args: Array<String>) {
    val employeeList = listOf(
            Employee(2,"Chandra Sekhar Nayak"),
            Employee(1,"Rivu Chakraborty"),
            Employee(4,"Indranil Dutta"),
            Employee(3,"Sonkho Deep Mondal"),
            Employee(6,"Debraj Dey"),
            Employee(5,"Koushik Mridha")
    )

    employeeList.sortedBy {
        it.employeeID
    }.forEach {
        println(it)
    }

}