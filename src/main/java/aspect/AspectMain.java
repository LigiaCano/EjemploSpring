package aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AspectConfig;
import aspectTarget.ControllerTime;

public final class AspectMain {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        ControllerTime controllerTime = context.getBean(ControllerTime.class);

        controllerTime.annotation();
        ((AbstractApplicationContext) context).close();
    }
}
