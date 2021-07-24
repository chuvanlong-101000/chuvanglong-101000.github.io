import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Repository repository = new Repository();
        repository.printList();

        System.out.println("Danh sách động vật có số chân bằng 4 là: ");
        repository.getAnimalByLegs();


    /*   
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(15);
        System.out.println("Danh sách ban đầu :");
        numbers.forEach(num -> System.out.println(num + "\t"));

        // danh sách các số chia hết cho 2
        System.out.println(" \n Danh sách chia hết cho 2");
        numbers.stream()
        .filter(num -> num % 2 == 0)
        .forEach(num -> System.out.println(num));

        // danh sách các số chia hết cho 2 và chỉ hiển thị 2 số
        System.out.println(" \n Danh sách chia hết cho 2 và có 2 phần tử :");
        numbers.stream()
        .filter(num -> num % 2 == 0)
        .limit(2).forEach(num -> System.out.println(num));

        // danh sach các số nhân với 10
        System.out.println( " \n Danh sách các sô sau khi nhân 10");
        numbers.stream()
        .map( num -> num*10)
        .forEach(num -> System.out.println(num));
        
        // đếm số phần tử chia hết cho 2
        System.out.println("\n Số lượng phần tử chia hết cho 2 :");
        long count =  numbers.stream()
        .filter(num -> num %2 == 0).count();
        System.out.println(count);
    */
       
        /*
        ArrayList<String> string = new ArrayList<>();
        string.add("long");
        string.add("trang");
        string.add("nam");

        System.out.println("Chuỗi ban đầu :");
        string.stream()
        .sorted()
        .forEach(str -> System.out.println(str +"\t"));

        System.out.println("\n Chuỗi sau khi sắp xếp :");
        string.stream()
        .sorted((str1, str2) -> str1.length() - str2.length())
        .forEach(str -> System.out.println(str +"\t"));

        System.out.println();
        Stream<String> stream = Stream.of( "Long "," Trang" ,"Hung");
        List<String> names = stream.collect(Collectors.toList());
        names.forEach(name -> System.out.println(name +"\t"));

        // kiểm tra danh sách tên thỏa mãn bắt đầu bằng L
        boolean isCheck = names.stream()
        .anyMatch((name) -> name.startsWith("L"));
        System.out.println(isCheck);

        // kiểm tra toàn bộ danh sách có thỏa mãn tên bắt đầu bằng H
         isCheck = names.stream()
        .allMatch((name) -> name.startsWith("H"));
        System.out.println(isCheck);

        // ngược lại vs allmatch
        isCheck = names.stream()
        .noneMatch((name) -> name.startsWith("H"));
        System.out.println(isCheck);
        */
 

    }
}