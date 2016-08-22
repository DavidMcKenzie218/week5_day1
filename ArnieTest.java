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

  @Test 
  public void hasPredatorQuotes(){
    predator.quotes();
    arnie.addPredatorQuotes(predator);
    assertEquals(3, arnie.quoteCount());
  }

  // @Test
  // public void hasTerminatorQuotes(){
    
  // }

  @Test 
  public void predatorHasQuotes(){
    predator.quotes();
    assertEquals(3, predator.quoteCount());
  }

  @Test
  public void predatorFirstQuote(){
    predator.quotes();
    assertEquals("Get to tha Choppa!", predator.outputQuote(0));
  }

}