import org.junit.*;
import static org.junit.Assert.*;

public class SquareTest {
  private Square newSquare = new Square(0,0);

  @Test
  public void Square_instantiatesCorrectly_true() {
    assertEquals(true, newSquare instanceof Square);
  }
}
