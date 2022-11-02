package com.github.guacamolegateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuacamoleGatewayApplication

fun main(args: Array<String>) {
	runApplication<GuacamoleGatewayApplication>(*args)
}
