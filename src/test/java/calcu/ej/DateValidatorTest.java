package calcu.ej;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DateValidatorTest {
  
  private DateValidator dateValidator;

  @Before
  public void inicialize() {
    dateValidator = new DateValidator();
  }

  @Test
  public void checkDateFormatter() {
    assertEquals(true, dateValidator.validateDate("20/05/2020"));
    assertEquals(true, dateValidator.validateDate("02/11/2025"));
    assertEquals(false, dateValidator.validateDate("31/02/1990"));
  }

}
