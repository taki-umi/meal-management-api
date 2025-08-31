package com.takiumi.meal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MealManagementApiApplication

fun main(args: Array<String>) {
	runApplication<MealManagementApiApplication>(*args)
}
