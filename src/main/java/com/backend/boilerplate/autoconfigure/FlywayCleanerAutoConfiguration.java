package com.backend.boilerplate.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sarvesh
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
public class FlywayCleanerAutoConfiguration {
    @Bean
    @ConditionalOnProperty(name = "flyway.repair", havingValue = "true", matchIfMissing = false)
    public FlywayMigrationStrategy clean() {
        return flyway -> {
            flyway.repair();
            flyway.migrate();
        };
    }
}
