package com.example;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by artyo on 25.04.2016.
 */
@Configuration
@EnableCaching(mode = AdviceMode.PROXY)
@EnableJpaRepositories("com.example")
@EnableTransactionManagement(proxyTargetClass = true,mode = AdviceMode.PROXY)
@ImportResource({"classpath:serviceBeans.xml"})
public class Config {
}
