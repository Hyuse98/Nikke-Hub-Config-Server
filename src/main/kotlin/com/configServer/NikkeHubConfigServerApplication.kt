package com.configServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class NikkeHubConfigServerApplication

fun main(args: Array<String>) {
	runApplication<NikkeHubConfigServerApplication>(*args)
}
