package calcu.ej;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TemperaturaTest {
  
  private Temperatura temperatura;

  @Before
  public void iniciar() {
    temperatura = new Temperatura();
  }

  @Test
  public void testCelsiusToFahrenheit(){
    assertEquals(50, temperatura.celsiusToFahrenheit(10), 0.05);
  }
  
  @Test
  public void testFahrenheitToCelsius() {
    assertEquals(260.93, temperatura.fahrenheitToKelvin(10), 0.1);
  }
  
  @Test
  public void testKelvinToCelsius() {
    assertEquals(-263.15, temperatura.kelvinToCelsius(10), 0.1);
  }
}
