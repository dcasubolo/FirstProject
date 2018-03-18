package business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import data.api.TodoService;
import data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Davide");
		assertEquals(3, todos.size());
	}
}