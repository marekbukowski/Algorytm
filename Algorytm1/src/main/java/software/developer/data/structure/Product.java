package software.developer.data.structure;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private String name;

    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product product) {
        return this.price.compareTo(product.getPrice());
    }
}
