// mô tả sản phẩm / mặt hàng

public class Product implements Entity {
    

    @Override
    public String toString() {
        return "Product [description=" + description + ", id=" + id + ", madeIn=" + madeIn + ", manufacturer="
                + manufacturer + ", name=" + name + "]";
    }

    private Long id;
    private String name;
    private String manufacturer;
    private String madeIn;
    private String description;

    
    
    public Long getId() {
        return id;
    }
    
    public Product (String name, String manufacturer, String madeIn, String description) {
        id = IdGenerator.getNewID();
        this.name = name;    
        this.manufacturer = manufacturer;
        this.madeIn = madeIn;
        this.description = description;
      }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
