public class Arnie{

  private String name;
  private String[] quotes;

  public Arnie(String name){
    this.name = name;
    this.quotes = new String[6];
  }

  public String getName(){
    return name;
  }

  public int quoteCount(){
    int counter = 0;
    for(String quote : quotes){
      if (quote !=null) {
        counter++;
      }
    }
    return counter;
  }

}