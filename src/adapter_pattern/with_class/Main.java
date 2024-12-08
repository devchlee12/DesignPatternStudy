package adapter_pattern.with_class;

public class Main {
    public static void main(String[] args){
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
