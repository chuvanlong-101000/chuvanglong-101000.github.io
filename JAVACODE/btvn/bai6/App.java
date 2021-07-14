import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Book book1 =new Book(1,"Dế Mèn phiêu lưu kí","Kim Đồng",1991);
        Book book2 =new Book(2,"Truyện Kiều","Nguyễn Du",1999);
        Book book3 =new Book(3,"Tam Quốc Diễn Nghĩa ","La Quán Trung",1987);
        
        Project project = new Project(1,"Lập trình java","Văn Long",2021,200,"Nguyên Vẹn",2020);

        TextBook textBook = new TextBook(1,"Dế Mèn phiêu lưu kí","Kim Đồng",1991,200,"Nguyên Vẹn",20,15);
        textBook.TonKho();

        Electric electric  = new Electric(1,"Dế mèn phiêu lưu kí","Kim Đồng",1991,"256GB",3000000,6000);
        electric.TongTien();

        System.out.println(book1);
        project.ViTri(5, "c2");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        book2.Update(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
