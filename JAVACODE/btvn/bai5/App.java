import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();        
        products.add(new Product(1, "Oppo Reno5 8GB-128GB", "Oppo Reno5 8GB-128GB",8390000, 10 , 7 , "OPPO", Category.Dienthoai));
        products.add(new Product(2, "Oppo Reno4 Pro", "Oppo Reno4 Pro",8151000, 25 , 10 , "OPPO",Category.Dienthoai));
        products.add(new Product(3, "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip",13497000, 10 , 3 , "Samsung", Category.Dienthoai));
        products.add(new Product(4, "Oppo A92", "Oppo A92",5990000, 30 , 15 , "OPPO", Category.Dienthoai));
        products.add(new Product(5, "Vivo Y20 4GB-64GB", "Vivo Y20 4GB-64GB",36900000, 15 , 10 , "VIVO", Category.Dienthoai));
        products.add(new Product(6, "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H",21840000, 15 , 4 , "Dell", Category.Laptop));
        products.add(new Product(7, " Loa bluetooth Compact 2", " Loa bluetooth Compact 2",290000, 20 , 15 , "Xiaomi", Category.Phukien));
        products.add(new Product(8, "Pin sạc dự phòng 10000mAh Mi Ultra Compact", "Pin sạc dự phòng 10000mAh Mi Ultra Compact",710000, 30 , 10 , "Xiaomi", Category.Phukien));
        products.add(new Product(9, "Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T",20790000, 20 , 16 , "Asus", Category.Laptop));
        products.add(new Product(10, "iPhone 12 Pro Max 128GB", "iPhone 12 Pro Max 128GB",30990000, 3 , 2 , "Iphone", Category.Apple));
        
        System.out.println("Bạn muốn gì : \n");
        System.out.println("0.Thoát");
        System.out.println("1.In thông tin dựa trên danh mục : \n");
        System.out.println("2.In thông tin các sản phẩm dựa theo hãng : \n");
        System.out.println("3.In thông tin sản phẩm dựa mức giá và danh mục : \n");
        System.out.println("4.Nhập vào một chuỗi bất kỳ và in ra các sản phẩm có tên tương tự chuỗi đó (tìm kiếm) :");
    
        int menu = sc.nextInt();

        switch(menu) {
            case 1: 
                System.out.println("Bạn chọn mục mấy :");
                    System.out.println("1.Điện thoại \n");
                    System.out.println("2.Laptop \n");
                    System.out.println("3.Apple \n");
                    System.out.println("4.Phụ kiện \n");
                    int menu1 = sc.nextInt();
                switch(menu1) {
                    case 1: 
                    products.stream()
                    .filter(i -> i.getCategory()
                    .equals(Category.Dienthoai))
                    .forEach(i -> System.out.println(i));
                    break;

                    case 2: 
                    products.stream()
                    .filter(i -> i.getCategory()
                    .equals(Category.Laptop))
                    .forEach(i -> System.out.println(i));
                    break;

                    case 3: 
                    products.stream()
                    .filter(i -> i.getCategory()
                    .equals(Category.Apple))
                    .forEach(i -> System.out.println(i));
                    break;

                    case 4: 
                    products.stream()
                    .filter(i -> i.getCategory()
                    .equals(Category.Phukien))
                    .forEach(i -> System.out.println(i));
                    break;
                }
            break;
            case 2 : 
                System.out.println("Mời bạn nhập hãng :");
                String a = sc.nextLine();
                products.stream().filter(b -> b.getProducer().equals(a)).forEach(b -> System.out.println(b));
            break;
            case 3:
                System.out.println("Bạn chọn mục mấy :");
                System.out.println("1.Điện thoại \n");
                System.out.println("2.Laptop \n");
                System.out.println("3.Apple \n");
                System.out.println("4.Phụ kiện \n");
                int menu2 = sc.nextInt();
                switch (menu2) {
                    case 1 :
                    System.out.println("Mời bạn chọn mứ giá :");
                    System.out.println("1.Dưới 2 triệu");
                    System.out.println("2.Từ 2 triệu đến 4 triệu");
                    System.out.println("3.Từ 4 triệu đến 7 triệu");
                    System.out.println("4.Từ 7 triệu đến 13 triệu");
                    System.out.println("5.Trên 13 triệu");
                    int menu3 = sc.nextInt();
                    switch (menu3) {
                        case 1: products.stream().filter(c -> c.getPrince()<2000000).forEach(c -> System.out.println(c));break;
                        case 2: products.stream().filter(c -> (c.getPrince()>2000000 && c.getPrince()<4000000)).forEach(c -> System.out.println(c));break;
                        case 3: products.stream().filter(c -> (c.getPrince()>4000000 && c.getPrince()>7000000)).forEach(c -> System.out.println(c));break;
                        case 4: products.stream().filter(c -> (c.getPrince()>7000000 && c.getPrince()<13000000)).forEach(c -> System.out.println(c));break;
                        case 5: products.stream().filter(c -> c.getPrince()>13000000).forEach(c->System.out.println(c));break;
                    }
                    break;

                    case 2 : 
                    System.out.println("Mời bạn chọn mứ giá :");
                    System.out.println("1.Dưới 2 triệu");
                    System.out.println("2.Từ 2 triệu đến 4 triệu");
                    System.out.println("3.Từ 4 triệu đến 7 triệu");
                    System.out.println("4.Từ 7 triệu đến 13 triệu");
                    System.out.println("5.Trên 13 triệu");
                    int menu4 = sc.nextInt();
                    switch (menu4) {
                        case 1: products.stream().filter(c -> c.getPrince()<2000000).forEach(c -> System.out.println(c));break;
                        case 2: products.stream().filter(c -> (c.getPrince()>2000000 && c.getPrince()<4000000)).forEach(c -> System.out.println(c));break;
                        case 3: products.stream().filter(c -> (c.getPrince()>4000000 && c.getPrince()>7000000)).forEach(c -> System.out.println(c));break;
                        case 4: products.stream().filter(c -> (c.getPrince()>7000000 && c.getPrince()<13000000)).forEach(c -> System.out.println(c));break;
                        case 5: products.stream().filter(c -> c.getPrince()>13000000).forEach(c->System.out.println(c));break;
                    }
                    break;

                    case 3 : 
                    System.out.println("Mời bạn chọn mứ giá :");
                    System.out.println("1.Dưới 2 triệu");
                    System.out.println("2.Từ 2 triệu đến 4 triệu");
                    System.out.println("3.Từ 4 triệu đến 7 triệu");
                    System.out.println("4.Từ 7 triệu đến 13 triệu");
                    System.out.println("5.Trên 13 triệu");
                    int menu5 = sc.nextInt();
                    switch (menu5) {
                        case 1: products.stream().filter(c -> c.getPrince()<2000000).forEach(c -> System.out.println(c));break;
                        case 2: products.stream().filter(c -> (c.getPrince()>2000000 && c.getPrince()<4000000)).forEach(c -> System.out.println(c));break;
                        case 3: products.stream().filter(c -> (c.getPrince()>4000000 && c.getPrince()>7000000)).forEach(c -> System.out.println(c));break;
                        case 4: products.stream().filter(c -> (c.getPrince()>7000000 && c.getPrince()<13000000)).forEach(c -> System.out.println(c));break;
                        case 5: products.stream().filter(c -> c.getPrince()>13000000).forEach(c->System.out.println(c));break;
                    }
                    break;

                    case 4 :
                    System.out.println("Mời bạn chọn mứ giá :");
                    System.out.println("1.Dưới 2 triệu");
                    System.out.println("2.Từ 2 triệu đến 4 triệu");
                    System.out.println("3.Từ 4 triệu đến 7 triệu");
                    System.out.println("4.Từ 7 triệu đến 13 triệu");
                    System.out.println("5.Trên 13 triệu");
                    int menu6 = sc.nextInt();
                    switch (menu6) {
                        case 1: products.stream().filter(c -> c.getPrince()<2000000).forEach(c -> System.out.println(c));break;
                        case 2: products.stream().filter(c -> (c.getPrince()>2000000 && c.getPrince()<4000000)).forEach(c -> System.out.println(c));break;
                        case 3: products.stream().filter(c -> (c.getPrince()>4000000 && c.getPrince()>7000000)).forEach(c -> System.out.println(c));break;
                        case 4: products.stream().filter(c -> (c.getPrince()>7000000 && c.getPrince()<13000000)).forEach(c -> System.out.println(c));break;
                        case 5: products.stream().filter(c -> c.getPrince()>13000000).forEach(c->System.out.println(c));break;
                    } 
                    break;
                }
            break;
            case 4 : 
                System.out.println("Mời bạn nhập tên sản phẩm cần tìm :");
                String d = sc.nextLine();
                products.stream().filter(e -> e.getName().equals(d)).forEach(e -> System.out.println(e));
            break;
            case 0:
                System.exit(0);
                break;
                default:break;
        }
    }
}
