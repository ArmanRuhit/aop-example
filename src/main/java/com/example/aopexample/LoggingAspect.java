package com.example.aopexample;
import org.aspectj.lang.JoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aopexample.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " "+ joinPoint.getArgs()[0].toString());
        System.out.println("Before loggers");
    }

    @After("execution(* *..checkout(..))")
    public void afterLogger() {
        System.out.println("After loggers");
    }

    @Pointcut("execution(* com.example.aopexample.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){


    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("After Returning ");
    }
}
