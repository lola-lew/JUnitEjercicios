package calcu.ej;

public class Calculadora {

//   Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
// para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).


  public double calcularDescuento(double precio, double descuento) {
    double precioFinal = precio - (precio * descuento);
    return precioFinal;
  }

  public double descuentoMaximo(double precio, double descuentoMax) {
    double precioFinal = precio - (precio * descuentoMax);
    return precioFinal;
  }

}
