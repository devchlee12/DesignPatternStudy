package prototype_pattern.framework;

public interface Product extends Cloneable{
    void use(String s);
    Product createCopy();
}
