import java.util.List;
import java.util.Scanner;

public class Book {   
    public Book(int id, String name, String nhaXuatBan, int year) {
        this.id = id;
        this.name = name;
        this.nhaXuatBan = nhaXuatBan;
        this.year = year;
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
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", nhaXuatBan=" + nhaXuatBan + ", year=" + year + "]";
    }
    int id ;
    String name ;
    String nhaXuatBan ;
    int year ;
    //thêm sách
    public void Insert( List<Book> list){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập ID của sách:");
        int id = sc.nextInt();
        System.out.println("Mời bạn nhập tên sách:");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập nhà sản xuất:");
        String nhaXuatBan = sc.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất:");
        int year = sc.nextInt();
        Book book = new Book(id , name , nhaXuatBan , year);
        list.add(book);
    }

    // Sửa
    public void Update( List<Book> list){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn ID của sách cần sửa:");
        int id = sc.nextInt();
        for(int i = 0 ; i < list.size() ; i++) {
            if (id == list.get(i).getId()) {
                System.out.println("Mời bạn nhập ID của sách:");
                int id1 = sc.nextInt();
                System.out.println("Mời bạn nhập tên sách:");
                String name = sc.nextLine();
                System.out.println("Mời bạn nhập nhà sản xuất:");
                String nhaXuatBan = sc.nextLine();
                System.out.println("Mời bạn nhập năm sản xuất:");
                int year = sc.nextInt();
                list.get(i).setId(id1);
                list.get(i).setName(name);
                list.get(i).setNhaXuatBan(nhaXuatBan);
                list.get(i).setYear(year);
            }
        }
    }

    //Xóa
    public void xoa( List<Book> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập ID của sách cần xóa:");
        int id = sc.nextInt();
        for(int i=0;i<list.size();i++) {
            if (id==list.get(i).getId()) {
                list.remove(i);
            }
        }
    }
}
