package com.configServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NikkeHubConfigServerApplication

fun main(args: Array<String>) {
	runApplication<NikkeHubConfigServerApplication>(*args)
}
