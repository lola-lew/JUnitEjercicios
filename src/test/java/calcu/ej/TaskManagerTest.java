package calcu.ej;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TaskManagerTest {
  
  private TaskManager taskManager;
  
  @Before
  public void inicialize() {
    taskManager = new TaskManager();
  }

  @Test
  public void taskShouldBeAdded() {
    assertEquals("Added.", taskManager.addTask("task1"));
    assertEquals("Added.", taskManager.addTask("task task task"));
  }

  @Test
  public void taskShouldBeRemoved() {
    taskManager.addTask("task1");
    assertEquals(true, taskManager.removeTask("task1"));
    assertNotEquals(true, taskManager.removeTask("task2"));
  }

  @Test
  public void tasksShouldBeListed() {
    taskManager.addTask("task1");
    taskManager.addTask("task2");
    assertEquals(2,taskManager.tasksList());
    assertNotEquals(0,taskManager.tasksList());
  }
  

}
