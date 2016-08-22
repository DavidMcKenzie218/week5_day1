import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ArnieTest {

  Arnie arnie;

  @Before
  public void before(){
    arnie = new Arnie("Arnold Schwarzenegger");
  }

  @Test
  public void hasName(){
    assertEquals("Arnold Schwarzenegger", arnie.getName());
  }

}