package prototype_pattern;

import prototype_pattern.framework.Manager;
import prototype_pattern.framework.Product;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    UnderlinePen underlinePen = new UnderlinePen('-');
    MessageBox messageBox = new MessageBox('*');
    MessageBox messageBox2 = new MessageBox('/');

    manager.register("ul",underlinePen);
    manager.register("mb1",messageBox);
    manager.register("mb2", messageBox2);

    Product ul = manager.create("ul");
    ul.use("Hello, world");
    Product mb1 = manager.create("mb1");
    mb1.use("Hello, world");
    Product mb2 = manager.create("mb2");
    mb2.use("Hello, world");
  }
}
