package bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Product> products = new ArrayList<>();
        products.add(new Product(1,"Gạo","Thức ăn",80 , 15000 ,12));
        products.add(new Product(2,"Thịt","Thức ăn",20 , 80000 ,16));
        products.add(new Product(3,"Lạc","Thức ăn",80 , 15000 ,75));
        products.add(new Product(4,"Tivi","Đồ da dụng",90 , 15000000 ,18));
        products.add(new Product(5,"Điều hòa","Đồ da dụng",8 , 15000000 ,2));
        products.add(new Product(6,"Máy giặt","Đồ da dụng",8 , 9000000 ,1));
        products.add(new Product(7,"Son","Mỹ phẩm",20 , 200000 ,12));
        products.add(new Product(8,"kem body","Mỹ phẩm",8 , 175000 ,2));
        products.add(new Product(9,"Sữa rửa mặt","Mỹ phẩm",8 , 180000 ,2));
        products.add(new Product(10,"Áo phông","Thời trang",40 , 150000 ,12));
        products.add(new Product(11,"Quần jean","Thời trang",8 , 1500000 ,4));
        products.add(new Product(12,"Váy","Thời trang",8 , 1500000 ,4));


        System.out.println("Bạn muốn gì : \n");
        System.out.println("0.Thoát \n ");
        System.out.println("1.Xem sản phẩm: \n");
        System.out.println("2.Thêm mới sản phẩm : \n");
        System.out.println("3. Tìm sản phẩm theo mã sản phẩm và sửa sản phẩm đó : \n");
        System.out.println("4.Tìm sản phẩm theo mã sản phẩm và xoá sản phẩm đó : \n" );
        System.out.println("5.Xem sản phẩm và số lượng bán được : \n");
        System.out.println("6.Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó : \n");
        System.out.println("7.Sắp xếp sản phẩm theo tên: \n");


        while(true) {
            int menu = sc.nextInt();
            switch ( menu) {
                case 0 : 
                System.exit(0);
                    break;
                    default:break;

                case 1 :
                    products.stream().forEach(p->System.out.println(p));
                break;

                case 2 : 
                    System.out.println("Mời bạn nhập sản phẩm mới");
                    int i = sc.nextInt();
                    int j = 0 ;
                    while( j < i ) {
                        System.out.println("Mời bạn nhập mã :");
                        long id = sc.nextLong();sc.nextLine();
                        System.out.println("Mời bạn nhập tên sản phẩm :");
                        String name = sc.nextLine();
                        System.out.println("Loại sản phẩm :");
                        String category = sc.nextLine();
                        System.out.println("Nhập số lượng :");
                        int soluong = sc.nextInt();sc.nextLine();
                        System.out.println("Mời bạn nhập giá :");
                        long giaban = sc.nextLong();sc.nextLine();
                        System.out.println("Mời bạn nhập số lượng bán :");
                        int soluongban = sc.nextInt();
                        Product z = new Product( id, name , category, soluong, giaban, soluongban);
                        products.add(z);
                        j++;                        
                    }                
                break;

                case 3: 
                    System.out.println("Mời bạn nhập sản phẩm muốn sửa :");
                    long ID = sc.nextLong();
                    for( int a = 0 ; a < products.size(); a++) {
                        if(ID == products.get(a).getId()) {
                            System.out.println("Mời bạn nhập mã :");
                            long id = sc.nextLong();sc.nextLine();
                            System.out.println("Mời bạn nhập tên sản phẩm :");
                            String name = sc.nextLine();
                            System.out.println("Loại sản phẩm :");
                            String category = sc.nextLine();
                            System.out.println("Nhập số lượng :");
                            int soluong = sc.nextInt();sc.nextLine();
                            System.out.println("Mời bạn nhập giá :");
                            long giaban = sc.nextLong();sc.nextLine();
                            System.out.println("Mời bạn nhập số lượng bán :");
                            int soluongban = sc.nextInt();
                            products.get(a).setId(id);
                            products.get(a).setName(name);;
                            products.get(a).setCategory(category);
                            products.get(a).setSoluong(soluong);
                            products.get(a).setGiaban(giaban);
                            products.get(a).setSonluongban(soluongban);
                        }
                    }
                break;

                case 4 :
                    System.out.println("Mời bạn nhập mã sản phẩm muốn xóa:");
                    long Id = sc.nextLong();
                    boolean check = false;
                    for(int b = 0 ; b < products.size() ; b++) {
                        if (Id == products.get(b).getId()) {
                            check = true;
                            products.remove(b);
                            break;
                        }else{
                            check = false;
                            System.out.println("Không tìm thấy mã sản phẩm tương ứng.");
                        }
                    }
                break;

                case 5 : 
                    Map<String, Integer> product = new HashMap < String ,Integer > ();
                    for( Product p : products) {
                        product.put(p.getName(), p.getSonluongban());
                    }
                    for( Map.Entry<String ,Integer> entry : product.entrySet()) {
                        System.out.println(entry.getKey()+" Số lượng sản phẩm: " + entry.getValue());
                    }
                break; 

                case 6:
                    Map<String, Integer> productd = new HashMap < String ,Integer > ();
                    for( Product p : products) {
                        productd.put(p.getCategory(), p.getSoluong());
                    }
                    for( Map.Entry<String ,Integer> entry : productd.entrySet()) {
                        System.out.println(entry.getKey()+" Số lượng bán được: " + entry.getValue());
                    }
                break;

                case 7 : 
                products.sort(new Comparator<Product>()
                {
                    public int compare(Product o1, Product o2) {
                        // TODO Auto-generated method stub
                        return o1.getName().compareTo(o2.getName());
                    } 
                });
                for( Product product1 : products ) {
                    System.out.println(product1);
                }
                break;         
            }
        }
    }
}
