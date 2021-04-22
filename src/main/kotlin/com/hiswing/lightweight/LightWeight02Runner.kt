package com.hiswing.lightweight

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

class LightWeight02Runner : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("lightweight02 start")
    }
}

@Configuration
class LightWeight02Config {
    @Bean
    @ConditionalOnProperty(value = ["batch.execute"], havingValue = "test02")
    fun execute(): LightWeight02Runner? {
        return LightWeight02Runner()
    }
}