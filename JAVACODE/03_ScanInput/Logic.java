import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Logic {
    
    public void demoLoop() {
        System.out.println("While, Scan input from console");
        for (int i = 0; i < 10; i++) {
          System.out.println("i = " + i);
        }
        int k = 0;
        while (k < 10) {
          System.out.println("k = " + k);
          k++;
        }
    }
    
    // nhập tên vào đưa ra bình luận
    public void getName() {
        Scanner input = new Scanner(System.in);   
        while (true) {
            System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
                String name = input.nextLine();
                if (name.equals("q")) {
                    break; //thoát ra khỏi vòng lặp while
                } else if (name.length() < 3) {
                    continue; //Tiếp tục vòng lặp, bỏ qua lệnh tiếp theo
                } else {
                    System.out.println("Tên của bạn thật là đẹp " + name);
                }      
        }
        input.close();
    }
    
    // nhập tên và đoán giới tính trong 1 mảng
    public void guessName() {
        // khai báo mảng : cách 1
        ArrayList<String> manNames = new ArrayList<>();
    
        manNames.add("Cường");
        manNames.add("Dũng");
        manNames.add("Thắng");
        manNames.add("Kiên");
        manNames.add("Long");
        manNames.add("Trung");
        manNames.add("Thành");
        manNames.add("Quân");
        // khai báo mảng : cách 2
        List<String> womanNames = List.of("Hoa", "Lan", "Hương", "Hằng", "Thuỷ", "Dung", "Hiền", "Khuê", "Trinh");
        List<String> neutralNames = List.of("Bình", "Thanh", "Linh");
    
    
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
                String name = input.nextLine();
            if (name.equals("q")) {
                break;
            } else {
                //Kiểm tra nếu tên nằm trong danh sách tên của Nam 
                for (String s : manNames) {
                    if (s.equals(name)) {
                        System.out.println("Nam giới");
                        break;
                    }
                }

                //Kiểm tra nếu tên nằm trong danh sách tên của Nữ
                for (String s : womanNames){
                    if (s.equals(name)) {
                        System.out.println("Nữ giới");
                        break;
                    }
                }
    
                //Kiểm tra nếu tên nằm trong danh sách tên không rõ Nam hay Nữ
                for (String s : neutralNames){
                    if (s.equals(name)) {
                        System.out.println("Giới tính của bạn là gì?");
                        String gender = input.nextLine();
                         System.out.println(name + " có giới tính là " + gender);
                         break;
                    }
                }
            }      
        }
        input.close();
    }
    

    // đoán số mà máy tính hiện ra
    public void guessNumber() {
        Random r = new Random();
        int number = r.nextInt(100);
    
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hãy đoán số hoặc gõ 'q' để thoát");
            String str = input.nextLine();
            if (str.equals("q")) {
                break;
            } else {
                int guessNumber = Integer.parseInt(str);
                if (guessNumber > number){
                    System.out.println("Số bạn nhập vào lớn hơn");
                } else if (guessNumber < number) {
                    System.out.println("Số bạn nhập vào nhỏ hơn");
                } else {
                    System.out.println("Bạn đã đoán đúng số " + number);
                }  
            }
        }
        input.close();
    }

    //kiểm tra sức khỏe
    public void guessBMI(){
        Scanner input = new Scanner(System.in);
        while( true){
            System.out.println("Nhập chiều cao của bạn hoặc ấn q để thoát :");
            float height = input.nextFloat();
            System.out.println(" Nhập cân nặng của bạn :");
            float weight = input.nextFloat();
            float BMI = weight / ( height * height );
            if( height == 0){
                break;
            }else{
                if( BMI < 18.5){
                    System.out.println("Bạn đang nhẹ cân , cần ăn nhiều chất dinh dưỡng .");
                }else if( BMI > 18.5 && BMI < 24.9){
                    System.out.println("Bạn có thân hình chuẩn .");
                }else if( BMI > 24.9 && BMI < 29.9){
                    System.out.println("Bạn đang thừa cân, cần ăn uống khoa học hơn .");
                }else if( BMI > 29.9){
                    System.out.println("Bạn quá béo , rất có hại cho sức khỏe .");
                }
            }
        }
        input.close();
    } 
}

