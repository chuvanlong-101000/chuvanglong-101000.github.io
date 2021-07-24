import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        repository.getData();
        Menu.mainMenu();

        while(true) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    //Đăng nhập
                    repository.login();
                    break;
                case 2:
                    //Đăng ký
                    repository.NewAccount();
                    break;
                default:
                    break;
            }
        }

    }
}
