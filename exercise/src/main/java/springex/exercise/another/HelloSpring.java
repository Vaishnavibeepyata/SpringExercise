package springex.exercise.another;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springex.exercise.BuisnessCalculationService;
@Configuration
@ComponentScan("springex.exercise")
public class HelloSpring {

	public static void main(String[] args) {
		
 	try (var context= new AnnotationConfigApplicationContext(HelloSpring.class)){
	System.out.println(context.getBean(BuisnessCalculationService.class).findMax());
	
 	}

	}

}
