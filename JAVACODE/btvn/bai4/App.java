import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Tủ lạnh","Đồ da dụng", 1500000, 3));
        products.add(new Product(2,"Điều hòa","Đồ da dụng", 250000, 1));
        products.add(new Product(3,"Tivi","Đồ da dụng", 7500000, 6));
        products.add(new Product(4,"Lò nướng","Đồ da dụng", 350000, 3));
        
        products.sort(new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        });

        for( Product p : products) {
            System.out.println(p);
        }

        products.sort((p1 ,p2) -> p1.getName().compareTo(p2.getName()));
        for ( Product p : products) {
            System.out.println(p);
        }


        products.sort(new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                // TODO Auto-generated method stub
                return o1.getAmount() > o2.getAmount() ? 1 : -1;
            }
        });

        for( Product p : products) {
            System.out.println(p);
        }

        products.sort((p1 ,p2) -> p1.getAmount() > p2.getAmount() ? 1 : -1);
        for ( Product p : products) {
            System.out.println(p);
        }

        for( Product p : products){
            if(p.getPrice() > 1000000) {
                System.out.println(p);
            }
        }

        products.stream().filter( p -> p.getAmount() > 1000000).forEach(
            p -> System.out.println(p)
        );

        Map <Product , Integer> s = new HashMap < Product ,Integer > ();
        Product s1 = new Product(1,"Tủ lạnh","Đồ da dụng", 1500000, 3);
        Product s2 = new Product(2,"Điều hòa","Đồ da dụng", 250000, 1);
        Product s3 = new Product(3,"Tivi","Đồ da dụng", 7500000, 6);
        Product s4 = new Product(4,"Lò nướng","Đồ da dụng", 350000, 3);


        s.put(s1,(s1.getAmount()*s1.getPrice()));
        s.put(s2,(s2.getAmount()*s2.getPrice()));
        s.put(s3,(s3.getAmount()*s3.getPrice()));
        s.put(s4,(s4.getAmount()*s4.getPrice()));

        for( Map.Entry<Product, Integer> entry : s.entrySet()) {
            System.out.println(entry.getKey() + "Tổng hóa đơn : " + entry.getValue());
        }
    }
}
