package bai2;

public class Product {
    public Product(long id, String name, String category, int soluong, long giaban, int sonluongban) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.soluong = soluong;
        this.giaban = giaban;
        this.sonluongban = sonluongban;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public long getGiaban() {
        return giaban;
    }
    public void setGiaban(long giaban) {
        this.giaban = giaban;
    }
    public int getSonluongban() {
        return sonluongban;
    }
    public void setSonluongban(int sonluongban) {
        this.sonluongban = sonluongban;
    }

    @Override
    public String toString() {
        return "Product [ id=" + id + ", name=" + name + ", category=" + category + ", soluong=" 
        + soluong + ", giaban=" + giaban + ",  sonluongban=" + sonluongban + "]";
    }
    long id ;
    String name ;
    String category ;
    int soluong ;
    long giaban ;
    int sonluongban ;

}
