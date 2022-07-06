package com.example.basic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasicExampleApp

fun main(args: Array<String>) {
  runApplication<BasicExampleApp>(*args)
}
