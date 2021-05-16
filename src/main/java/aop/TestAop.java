package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TestAop {

    @Around("execution( * *..repository.*.*(..))") // repository에 있는 모든 클래스 메서드
    public Object LogInLog(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        try {
            // before advice
            StopWatch sw = new StopWatch();
            sw.start();
            System.out.println("aop start -around ");

            result = proceedingJoinPoint.proceed();// do target

            // after advice
            sw.stop();
            Long total = sw.getTotalTimeMillis();
            System.out.println("aop end - around ! ");

            String className = proceedingJoinPoint.getTarget().getClass().getName();
            String methodName = proceedingJoinPoint.getSignature().getName();
            String taskName = className + "." + methodName;

        } catch (Throwable throwable) { // 에러 발생 실행
            System.out.println("exception! ");
        }
        return result;
    }

}