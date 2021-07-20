import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("0332000858","Chử Văn Long" , LocalDate.of(2000, 10, 10), "Hưng Yên", Gioitinh.nam, "0969375805", "Vanlong@gmail.com"));
        customers.add(new Customer("0332000456","Chử Hoài Nam" , LocalDate.of(2006, 02, 07), "Hưng Yên", Gioitinh.nam, "0969375888", "hoainam@gmail.com"));
        customers.add(new Customer("0332000168","Nguyễn Thu Trang" , LocalDate.of(2000, 10, 06), "Hưng Yên", Gioitinh.nu, "0969378888", "thutrang@gmail.com"));
        customers.add(new Customer("0332000279","Nguyễn Thị Lệ" , LocalDate.of(2008, 10, 06), "Hưng Yên", Gioitinh.nu, "0969379999", "thile@gmail.com"));
        System.out.println(" Bạn muốn thực hiện công việc nào :");
        System.out.println(" 1. Xem thông tin toàn bộ khách hàng.");
        System.out.println(" 2. Xem thông tin khách nữ hoặc nam.");
        System.out.println(" 3. Thêm thông tin khách hàng vào 1 danh sách.");
        System.out.println(" 4. Tìm kiếm thông tin dựa theo mã khách hàng.");
        System.out.println(" 0. Thoát chương trình :");
        
        while(true){
            int menu = sc.nextInt();
            switch (menu) {
                case 0 :                
                System.exit(0);
                default:
                break;
                case 1 :
                System.out.println(customers);
                break;
                case 2 :
                System.out.println("Mời bạn chọn giới tính khách hàng : ") ;
                System.out.println("1 . Nam");
                System.out.println("2 . Nữ") ;
                int menu1 = sc.nextInt();
                switch (menu1) {
                    case 1 : 
                    customers.stream()
                    .filter(i -> i.getGioitinh()
                    .equals(Gioitinh.nam))
                    .forEach(i -> System.out.println(i));
                    break;
                    case 2 : 
                    customers.stream()
                    .filter(i -> i.getGioitinh()
                    .equals(Gioitinh.nu))
                    .forEach(i -> System.out.println(i));
                     break;
                }
                break;
                case 3 : 
                System.out.println("Mời bạn nhập số khách hàng mà bạn muốn thêm:");
                int a = sc.nextInt();sc.nextLine();
                int b = 0;           
                while (b < a) {
                    System.out.println("Mời bạn nhập mã:");
                    String id = sc.nextLine();
                    id = Validation.validateId(id);

                    System.out.println("Mời bạn nhập tên khách hàng:");
                    String name = sc.nextLine();

                    System.out.println("Mời bạn nhập ngày sinh:");
                    LocalDate dateOfBirth = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());sc.nextLine();

                    System.out.println("Mời bạn nhập quê quán");
                    String adress = sc.nextLine();

                    System.out.println("Mời bạn nhập số điện thoại:");
                    String phoneNumber = sc.nextLine();                
                    phoneNumber = Validation.validateMobile(phoneNumber);

                    System.out.println("Mời bạn nhập Email:");
                    String email = sc.nextLine();               
                    email=Validation.validateEmail(email);

                    System.out.println("Mời bạn chọn giới tính. 1 - là nữ, 2 - là nam");
                    int m = sc.nextInt();
                    Gioitinh gt = Gioitinh.nam;
                    if(m==1){
                        gt=Gioitinh.nu;
                    }if(m==2){
                        gt=Gioitinh.nam;
                    }
                    b++;
                    Customer z = new Customer(id,name,dateOfBirth,adress,gt,phoneNumber,email);
                    customers.add(z);  
                }
                break;
                case 4 :           
                System.out.println("Mời bạn nhập mã khách hàng bạn muốn xóa:");
                String d = sc.nextLine();
                boolean c =false;
                for (int i = 0; i < customers.size(); i++) {
                    if ( d.equals(customers.get(i).getId())) {
                        c = true;
                        customers.remove(i);
                        break;
                    }else{
                        c = false;
                        System.out.println("Không tìm thấy mã khách hàng tương ứng.");
                        break;
                    }
                }
                break;
            }
        }
    }
}
