package aspectTarget;

import org.springframework.stereotype.Controller;


import aspect.Time;
@Controller
public class ControllerTime {
	
	@Time
    public void annotation() {
		 System.out.println("-----------------> ControllerTime:annotation");    
	}

}
