package com.backend.config;

import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import com.backend.aop.logging.LoggingAspect;
import com.backend.constant.AppConstants;

@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {

    @Bean
    @Profile(AppConstants.SPRING_PROFILE_DEVELOPMENT)
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
}
