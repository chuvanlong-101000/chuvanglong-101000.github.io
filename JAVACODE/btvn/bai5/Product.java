public class Product {
    
    public Product(int id, String name, String notes, int prince, int amount, int sell, String producer,
            Category category) {
        this.id = id;
        this.name = name;
        this.notes = notes;
        this.prince = prince;
        this.amount = amount;
        this.sell = sell;
        this.producer = producer;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public int getPrince() {
        return prince;
    }
    public void setPrince(int prince) {
        this.prince = prince;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getSell() {
        return sell;
    }
    public void setSell(int sell) {
        this.sell = sell;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ",  name=" + name + ",  notes="
        + notes + ", prince=" + prince + ",amount=" + amount + ", sell=" + sell + " , producer=" + producer + " ,category=" + category +"]";
    }
    
    int id ;
    String name ;//tên
    String notes ;//mô tả
    int prince ;//giá
    int amount;//số lượng 
    int sell ;//số lượng bán
    String producer ; //hãng 
    Category category ; // danh mục
    

    
}
