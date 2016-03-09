package injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.E1Config;
import injection.MessageManager;

public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new AnnotationConfigApplicationContext(E1Config.class);
	     MessageManager manager = context.getBean(MessageManager.class);
	     manager.addMessage("3","tres");
	     manager.addMessage("4","cuatro");
	     manager.addMessage("5","cinco");
	     System.out.println(manager.count());
	     ((AbstractApplicationContext) context).close();
	}

}
