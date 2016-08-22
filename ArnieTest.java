import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ArnieTest {

  Arnie arnie;
  Predator predator;

  @Before
  public void before(){
    arnie = new Arnie("Arnold Schwarzenegger");
    predator = new Predator();
  }

  @Test
  public void hasName(){
    assertEquals("Arnold Schwarzenegger", arnie.getName());
  }

  @Test
  public void hasNoQuotes(){
    assertEquals(0, arnie.quoteCount());
  }

  // @Test void hasPredatorQuotes(){
  //   assertEquals()
  // }

  @Test 
  public void predatorHasQuotes(){
    predator.quotes();
    assertEquals(3, predator.quoteCount());
  }

}