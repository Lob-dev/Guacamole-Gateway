package com.github.guacamolegateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuacamoleGatewayApplication

fun main(args: Array<String>) {
	println("start Application. Hello")
	runApplication<GuacamoleGatewayApplication>(*args)
}