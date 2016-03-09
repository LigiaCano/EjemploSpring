package injection;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class MessageServiceTest {

    private MessageService messageService;
    
    @Before
    public void before(){
        this.messageService= new MessageService();
    }

    @Test
    public void testAddMessage() {
        messageService.add("1", "uno");
        assertEquals("uno", messageService.message("1"));
    }

    @Test
    public void testKey() {
        messageService.add("2", "dos");
        messageService.add("3", "tres");
        messageService.add("4", "cuatro");
        assertEquals("2", messageService.key("dos"));
        assertEquals("4", messageService.key("cuatro"));
    }
    
    @Test 
    public void testCount(){
    	 messageService.add("2", "dos");
         messageService.add("3", "tres");
         messageService.add("4", "cuatro");
         assertEquals(3, messageService.count());
    }
    
    @Test
    public void testDelete(){
    	 messageService.add("2", "dos");
    	 messageService.delete("2");
    	 assertEquals(0, messageService.count());
    }
    
}
