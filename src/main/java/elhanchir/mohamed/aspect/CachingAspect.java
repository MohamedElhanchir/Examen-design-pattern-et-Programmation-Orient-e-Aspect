package elhanchir.mohamed.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

public class CachingAspect {
    private final Map<String, Object> cache = new HashMap<>();

    @Pointcut("@annotation(elhanchir.mohamed.aspect.Cachable)")
    public void cachableMethods() {
    }

    @Around("cachableMethods()")
    public Object cacheResult(ProceedingJoinPoint joinPoint) throws Throwable {
        String key = joinPoint.getSignature().toString();
        if (cache.containsKey(key)) {
            System.out.println("Returning cached result for " + key);
            return cache.get(key);
        }

        Object result = joinPoint.proceed();
        cache.put(key, result);
        return result;
    }
}






