package springex.exercise.another;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbdataservice implements DataService {

	public int[] retriveData()
	{
	return new int[] {1,2,3,4,5};
	
}
}
	


