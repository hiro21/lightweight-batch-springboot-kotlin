package com.hiswing.lightweight

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

class LightWeight01Runner : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("lightweight01 start")
    }
}

@Configuration
class LightWeight01Config {
    @Bean
    @ConditionalOnProperty(value = ["batch.execute"], havingValue = "test01")
    fun execute(): LightWeight01Runner? {
        return LightWeight01Runner()
    }
}