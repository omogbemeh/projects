package com.omogbemeh.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution (* com.omogbemeh.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toString();
        logger.info(methodName + " execution started");
        Instant start = Instant.now();
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        Instant end = Instant.now();
        long between = Duration.between(start, end).toMillis();
        logger.info(methodName + " execution ended");
        logger.info("Time taken: " + between + " milliseconds");
    }
}
