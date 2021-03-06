package config;

import injection.MessageManager;
import injection.MessageService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class E2Config {
    
    //<bean id="messageService" class="spring.injection.e1.MessageService" />
    @Bean
    public MessageService messageService() {
        return new MessageService();
    }
    
    //<bean id="messagePrinter" class="spring.injection.e1.MessagePrinter">
    @Bean
    public MessageManager messagePrinter() {
        return new MessageManager();
    }
    
}
