package calcu.ej;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TaskManagerTest {
  
  private TaskManager taskManager;
  
  @Before
  public void iniciar() {
    taskManager = new TaskManager();
  }

  @Test
  public void taskShouldBeAdded() {
    assertEquals("Added.", taskManager.addTask("task1"));
  }
  

}
