package calcu.ej;

// Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
// reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
// Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
// correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.


public class PasswordValidator {

  public boolean passwordValidation(String pass) { 
    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!\u00A1?\u00BF:])(?=\\S+$).{8,}$";
    if(pass.matches(pattern)) return true; else return false;
  }
}

// pattern:
// ^                 # start-of-string
// (?=.*[0-9])       # a digit must occur at least once
// (?=.*[a-z])       # a lower case letter must occur at least once
// (?=.*[A-Z])       # an upper case letter must occur at least once
// (?=.*[@#$%^&+=!\u00A1?\u00BF:])  # a special character must occur at least once
// (?=\S+$)          # no whitespace allowed in the entire string
// .{8,}             # anything, at least eight places though. Also could be {min, max}
// $                 # end-of-string