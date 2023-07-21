package calcu.ej;

// Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
// (por ejemplo, Celsius, Fahrenheit, Kelvin).
// Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
// se realiza correctamente y produce los resultados esperados.

public class Temperatura {
  
  public double celsiusToFahrenheit(double celsius) {
    return ((celsius * 9.0/5.0)) +32 ;
  }

  public double fahrenheitToKelvin(double fahrenheit) {
    return (((fahrenheit - 32)*5.0)/9.0)+273.15;
  }

  public double kelvinToCelsius(double kelvin) {
    return kelvin-273.15;
  }
}
