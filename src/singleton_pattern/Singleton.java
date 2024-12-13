package singleton_pattern;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("인스턴스 생성");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
