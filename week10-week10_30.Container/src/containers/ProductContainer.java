package containers;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String getName() {
        return this.productName;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + super.toString();
    }
}
