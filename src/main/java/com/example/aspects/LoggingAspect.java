package com.example.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Pointcut("execution(* com.example..*(..))")
    private void anyPublicMethod() {
    }

    @Before("anyPublicMethod()")
    public void beforeAnyPublicMethod(JoinPoint joinPoint) {
        log.info(" :: before :: " + joinPoint.getSignature().getName());
    }

    @After("anyPublicMethod()")
    public void afterAnyPublicMethod(JoinPoint joinPoint) {
        log.info(" :: after :: " + joinPoint.getSignature().getName());
    }

    @Around("execution(* com.example.aspects.controller..*(..))")
    public Object aroundControllerMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();
        log.info(" :: Time :: " + (System.nanoTime() - start) + " ns");
        return proceed;
    }
}
