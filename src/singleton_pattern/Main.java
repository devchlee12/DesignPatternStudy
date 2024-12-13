package singleton_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("시작");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2){
            System.out.println("같은 인스턴스");
        }
        else{
            System.out.println("같지 않은 인스턴스");
        }
        System.out.println("끝");
    }
}
