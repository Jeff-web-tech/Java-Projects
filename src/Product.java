public class Product {
    private String name;
    private double price;
    private double discountPercentage;

    public Product(String name, double price, double discountPercentage) {
        this.name = name;
        this.price = price;
        setDiscountPercentage(discountPercentage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }
        this.discountPercentage = discountPercentage;
    }

    public double getFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

}
