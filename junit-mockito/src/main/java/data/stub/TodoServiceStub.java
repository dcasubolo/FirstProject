package data.stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import data.api.TodoService;

public class TodoServiceStub implements TodoService {
	public List<String> retrieveTodos(String user) {
		
		List<String> TodoServiceList  = new ArrayList <String>();
		if ( user =="Davide") {
		 TodoServiceList = Arrays.asList("Learn Spring MVC", "Learn Spring",
						"Learn to Dance" , "Learn Spring boot");
		}
		  
		else if ( user =="Fabio")
		 {
			TodoServiceList = Arrays.asList("Learn Spring MVC", "Learn Spring",
						"Learn to Dance" , "Learn Spring boot");
		}
		
		return  TodoServiceList;
  }
}