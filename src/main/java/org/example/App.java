package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
interface greetingService{
    public void greeting(String name);
}
@Component
class greetingInEnglish implements greetingService
{
    public void greeting(String name) {
        System.out.println("hello "+ name);
    }
}
@Component
class greetingINFrench implements greetingService{
    public void greeting(String name) {
        System.out.println("Bonjour "+name);
    }
}
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext AC=new AnnotationConfigApplicationContext("org.example");
        greetingService gc=(greetingService) AC.getBean("greetingInEnglish");
        gc.greeting("sanskar");
    }
}