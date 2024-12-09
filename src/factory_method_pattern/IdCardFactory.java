package factory_method_pattern;

public class IdCardFactory extends Factory{
    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다");
    }
}
