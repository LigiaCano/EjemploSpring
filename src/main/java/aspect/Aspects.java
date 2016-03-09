package aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspects {
	
	 
	 @Around("@annotation(aspect.Time)")
	 public Object consejoE(ProceedingJoinPoint pjp) throws Throwable {
		 long time_start,time_end;
		 time_start = System.currentTimeMillis();
		 System.out.printf("antes: %s%n", LocalDateTime.now());
	     Object obj = pjp.proceed();
	     time_end = System.currentTimeMillis();
	     System.out.printf("despues: %s%n", LocalDateTime.now());
	     System.out.printf("milisegundos: " + ( time_end - time_start) +"");
	     return obj;
	}

}
