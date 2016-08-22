import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ArnieTest {

  Arnie arnie;
  Predator predator;
  Terminator2 terminator2; 

  @Before
  public void before(){
    arnie = new Arnie("Arnold Schwarzenegger");
    predator = new Predator();
    terminator2 = new Terminator2();
  }

  //ARNIE TESTS

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

  @Test
  public void hasTerminator2Quotes(){
    terminator2.quotes();
    arnie.addTerminator2Quotes(terminator2);
    assertEquals(3, arnie.quoteCount());
  }

  // PREDATOR TESTS

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

  //TERMINATOR 2 TESTS

  @Test
  public void terminator2Quotes(){
    terminator2.quotes();
    assertEquals(3, terminator2.quoteCount());
  }

  @Test
  public void terminator2FirstQuote(){
    terminator2.quotes();
    assertEquals("Hasta la vista, baby.", terminator2.outputQuote(0));
  }

}