package com.omogbemeh.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class VehicleAspect {
    private boolean vehicleStarted = false;

    @Before("execution(* com.omogbemeh.services.*.*(..))")
    public void checkIfVehicleIsStarted(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (((boolean) args[0])== false) System.out.println("The engine isn't on");
        System.out.println("The before is running fine!");
    }
}
