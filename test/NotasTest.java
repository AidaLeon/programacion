import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class NotasTest {
  @Test
  public void testInsuficiente(){
    assertEquals("Insuficiente", Notas.opciones(3));
  }
  @Test
  public void testSuficiente(){
    assertEquals("Suficiente", Notas.opciones(5.5));
  }

  @Test
  public void testNotable(){
    assertEquals("Notable", Notas.opciones(7.5));
  }

  @Test
  public void testSobresaliente(){
    assertEquals("Sobresaliente", Notas.opciones(10));
  }

}