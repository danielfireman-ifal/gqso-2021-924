package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Controller controller = new Controller();
    assertEquals("Bem-vidos(as) a API calculadora!", controller.sayHi());
  }
}
