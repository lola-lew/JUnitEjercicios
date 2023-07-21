package calcu.ej;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;

public class CalculadoraTest {

private Calculadora calcu;

  @Before
  public void iniciarClase() {
    calcu = new Calculadora();
  }

  @Test
  public void shouldBe10Discount() {
    assertEquals(9.0, calcu.calcularDescuento(10, 0.1),0.05);
  }

  @Test
  public void shouldBeMaxDiscount() {
    assertEquals(5, calcu.descuentoMaximo(10, 0.5), 0.05);
    assertNotEquals(5, calcu.descuentoMaximo(100, 0.5), 0.05);
    assertEquals(50, calcu.descuentoMaximo(100, 0.5), 0.05);
    
  }
}