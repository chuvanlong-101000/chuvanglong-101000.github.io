import java.util.NoSuchElementException;
import java.util.Scanner;

public class Constroller extends Repository {
    protected Long NewId;
    boolean isLogged = false;
    IdGenerator idgenerator = new IdGenerator();
    public void login() {
        Scanner sc = new Scanner(System.in);        
        while (true) {
            System.out.println("Nhấn q để quay lại: ");
            System.out.println("Nhập username: ");
            String username =sc.nextLine();
            if (username.equals("q")) {
                break;
            }
            System.out.println("Nhập mật khẩu:");
            String password = sc.nextLine();
            if (password.equals("q")) {
                break;
            }
            int count = 0;
            for (User user : users) {
                if (username.equals(user.getUsername())) {
                    count++;
                    if (password.equals(user.getPassword())) {
                        NewId = user.getId();
                        isLogged = true;
                        System.out.println("Đăng nhập thành công, Xin chào " + user.getUsername());
                        while (isLogged) {
                            loginController();
                        }
                        break;
                    } else {
                        loginFail();
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Kiểm tra lại username.\n");
            }
        }
    }

    public void loginFail() {
        Scanner sc = new Scanner(System.in);
        Menu.Menu2();
        while(true){
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    forgotPassword();
                    break;
                 default:
                    break;
            }
        }
    }

    public void loginController() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu.Menu1();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    changeUsername();
                    break;
                case 2:
                    changeEmail();
                    break;
                case 3:
                    changePassword();
                    break;
                case 4:
                    NewId = null;                    
                    isLogged = false;
                    System.out.println("Đăng xuất thành công. \n \n");
                    break;
                case 0:
                    isLogged = false;
                    break;
                default:
                    break;
            }
        }
    }


    public void changePassword(){
        //Thay đổi mật khẩu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu mới: ");
        String newPassword = sc.nextLine();
        users.stream().filter(user -> user.getId() == NewId).findFirst().get().setPassword(newPassword);
        System.out.println("Đổi mật khẩu mới thành công.");
    }

    public void changeUsername(){
        //Thay đổi username
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập username mới: ");
        String newUsername = sc.nextLine();
        users.stream().filter(user -> user.getId() == NewId).findFirst().get().setUsername(newUsername);
        System.out.println("Đổi username mới thành công.");
    }

    public void changeEmail(){
        //Thay đổi email
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email mới: ");
        String newEmail = sc.nextLine();
        users.stream().filter(user -> user.getId() == NewId).findFirst().get().setEmail(newEmail);
        System.out.println("Đổi email mới thành công.");

    }

    public void forgotPassword(){
        //Quên mật khẩu
        boolean isExisted = false;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập Email đăng ký: ");
            System.out.println("Nhấn q để quay lại: ");
            String emailReg = sc.nextLine();
            if (emailReg.equals("q")) {
                break;
            }
            try {
                User forgotten = users.stream().filter(user -> user.getEmail().equals(emailReg)).findFirst().get();
                isExisted = true;
                NewId = forgotten.getId();
                changePassword();
                NewId = null;
                break;

            } catch (NoSuchElementException e) {
                System.out.println("Tài khoản không tồn tại.");
            }
        }
    }

    public void NewAccount(){
        //Tạo tài khoản mới
        Scanner sc = new Scanner(System.in);
        Long id = idgenerator.getNewId();
        System.out.println("Bắt đầu đăng ký, mời bạn nhập thông tin: ");
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        users.add(new User(id, username, email, password));
        System.out.println("Đăng ký thành công.");
    }
}
