package Buoi10;

public class Products {
    private int id;
    private String product_name;
    private String product_price;
    private String product_size;
    private String product_color;
    private int brand_id;

    public Products() {
    }

    public Products(int id, String product_name, String product_price, String product_size, String product_color, int brand_id) {
        this.id = id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_size = product_size;
        this.product_color = product_color;
        this.brand_id = brand_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", product_name='" + product_name + '\'' +
                ", product_price='" + product_price + '\'' +
                ", product_color='" + product_color + '\'' +
                '}';
    }
}
