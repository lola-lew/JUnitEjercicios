package calcu.ej;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordValidatorTest {
  private PasswordValidator passValidator;

  @Before
  public void iniciar() {
    passValidator = new PasswordValidator();
  }

  @Test
  public void testPasswordValidatorTrue() {
    assertTrue(passValidator.passwordValidation("aaZZa44!"));
    assertTrue(passValidator.passwordValidation("hghgaAA3?"));
    assertTrue(passValidator.passwordValidation("56#ffGGf"));
  }

  @Test
  public void testPasswordValidatorFalse() {
    assertFalse(passValidator.passwordValidation("dsf 44"));
    assertFalse(passValidator.passwordValidation("!gg"));
    assertFalse(passValidator.passwordValidation("nnNN4568"));
  }
}
