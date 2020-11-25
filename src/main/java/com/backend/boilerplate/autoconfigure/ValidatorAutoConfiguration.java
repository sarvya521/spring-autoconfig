package com.backend.boilerplate.autoconfigure;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import javax.validation.ConstraintValidatorFactory;

/**
 * @author sarvesh
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
public class ValidatorAutoConfiguration {

    @Bean
    public ConstraintValidatorFactory constraintValidatorFactory(AutowireCapableBeanFactory beanFactory) {
        return new SpringConstraintValidatorFactory(beanFactory);
    }
}
