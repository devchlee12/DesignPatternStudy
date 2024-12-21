package prototype_pattern.framework;

public class UnderlinePen implements Product{
  private char ulchar;

  public UnderlinePen(char ulchar) {
    this.ulchar = ulchar;
  }

  @Override
  public void use(String s) {
    System.out.print(s);
    for (int i = 0;i < s.length();i++){
      System.out.print(ulchar);
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
