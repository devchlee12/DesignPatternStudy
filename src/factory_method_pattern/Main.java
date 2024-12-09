package factory_method_pattern;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("test1");
        Product card2 = factory.create("test2");
        Product card3 = factory.create("test3");
        card1.use();
        card2.use();
        card3.use();
    }
}
