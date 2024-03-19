package com.storebook.storebook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StoreBookApplication

fun main(args: Array<String>) {
	runApplication<StoreBookApplication>(*args)
}
