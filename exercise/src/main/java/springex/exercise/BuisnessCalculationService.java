package springex.exercise;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springex.exercise.another.DataService;



@Component
public class BuisnessCalculationService {
	
	DataService dataservice;
	 

	   
        
public BuisnessCalculationService(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}
public int findMax()
{
	return  Arrays.stream(dataservice.retriveData()).max().orElse(0);
}


	
		
	}
	
	


