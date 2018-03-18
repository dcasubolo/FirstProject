package business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import data.api.TodoService;

public class TodoBusinessImplMockitoTest {
//prova GitHub  
	@Test
	public void usingMockito() {
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoService.retrieveTodos("Davide")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Davide");
		assertEquals(2, todos.size());
	}@Test
	public void usingMockito2() {
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance" , "Learn Spring boot");
		when(todoService.retrieveTodos("Fabio")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Fabio");
		assertEquals(3, todos.size());
	}
	@Test
	public void usingMockito3() {
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList();
		when(todoService.retrieveTodos("Francesca")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Francesca");
		assertEquals(0, todos.size());
	}
}