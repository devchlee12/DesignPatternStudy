package prototype_pattern.framework;

public class MessageBox implements Product{
  private char decoChar;
  public MessageBox(char decoChar) {
    this.decoChar = decoChar;
  }

  @Override
  public void use(String s) {
    for (int i = 0;i < s.length() + 2;i++){
      System.out.print(decoChar);
    }
    System.out.print(decoChar);
    System.out.print(s);
    System.out.println(decoChar);
    for (int i = 0;i < s.length() + 2;i++){
      System.out.print(decoChar);
    }
  }

  @Override
  public Product createCopy() {
    Product p = null;
    try {
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }
}
