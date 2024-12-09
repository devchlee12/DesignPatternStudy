package factory_method_pattern;

public class IdCard extends Product{
    private String owner;
    @Override
    public void use() {
        System.out.println(owner + "의 카드 사용");
    }

    //생성자의 접근제한자가 default인 이유는 팩토리를 통해서만 생성하게 하려고
    IdCard(String owner) {
        System.out.println(owner + "의 카드 제작");
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public String getOwner() {
        return owner;
    }
}
