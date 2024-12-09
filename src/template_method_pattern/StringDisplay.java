package template_method_pattern;

public class StringDisplay extends AbstractDisplay{
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0;i < str.length();i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
