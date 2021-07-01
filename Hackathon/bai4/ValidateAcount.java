public class ValidateAcount {
    //Phần đăng nhập vào tài khoản khách hàng
    public final String MOBILE = " 0123456789" ;
    public final String PASSWORLD = " chuvanlong" ;
    public boolean CheckAcount( String mobile , String passworld) {
        if(mobile.equals(MOBILE)){
            if(passworld.equals(PASSWORLD)){
                System.out.println("Đăng nhập thành công!");
                return true;
            }else{
                System.out.println("Mật khẩu sai, vui lòng nhập lại");
                return false;
            }
        }else{
            System.out.println("Kiểm tra lại số điện thoại hoặc passworld");
            return false;
        }
    }
}
