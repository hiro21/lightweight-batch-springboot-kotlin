package com.hiswing.lightweight

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LightweightApplication

fun main(args: Array<String>) {
	runApplication<LightweightApplication>(*args)
}
