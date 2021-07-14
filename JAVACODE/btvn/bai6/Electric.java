public class Electric extends Book implements Download{
    public Electric(int id, String name, String nhaXuatBan, int year, String dungluong, int luottai, int giathanh) {
        super(id, name, nhaXuatBan, year);
        this.dungluong = dungluong;
        this.luottai = luottai;
        this.giathanh = giathanh;
    }


    public String getDungluong() {
        return dungluong;
    }
    public void setDungluong(String dungluong) {
        this.dungluong = dungluong;
    }
    public int getLuottai() {
        return luottai;
    }
    public void setLuottai(int luottai) {
        this.luottai = luottai;
    }
    public int getGiathanh() {
        return giathanh;
    }
    public void setGiathanh(int giathanh) {
        this.giathanh = giathanh;
    }


    @Override
    public String toString() {
        return "Electric [dungluong=" + dungluong + ", giathanh=" + giathanh + ", luottai=" + luottai + "]";
    }
    String dungluong ;
    int luottai;
    int giathanh ;

    
    @Override
    public void TongTien() {
        // TODO Auto-generated method stub
        long Tong = getLuottai()* getGiathanh();
        System.out.println("Tổng tiền = " +Tong);
    }
}
