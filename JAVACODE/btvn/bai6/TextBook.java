public class TextBook extends Book implements Muon,Kho{
    @Override
    public String toString() {
        return "TextBook [ sotrang=" + sotrang + ", tinhtrang=" + tinhtrang
                + ", soluongmuon=" + soluongmuon + ", tongsoluong=" + tongsoluong + "]";
    }
    int sotrang ;
    String tinhtrang ;
    int tongsoluong ;
    int soluongmuon ; 

    public TextBook(int id, String name, String nhaXuatBan, int year, int sotrang, String tinhtrang, int tongsoluong,int soluongmuon) {
        super(id, name, nhaXuatBan, year);
        this.sotrang = sotrang;
        this.tinhtrang = tinhtrang;
        this.tongsoluong = tongsoluong;
        this.soluongmuon = soluongmuon;
    }

    public int getSotrang() {
        return sotrang;
    }
    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    public String getTinhtrang() {
        return tinhtrang;
    }
    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    public int getTongsoluong() {
        return tongsoluong;
    }
    public void setTongsoluong(int tongsoluong) {
        this.tongsoluong = tongsoluong;
    }
    public int getSoluongmuon() {
        return soluongmuon;
    }
    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    @Override
    public void TonKho() {
        // TODO Auto-generated method stub
        System.out.println(" Số sách còn lại trong kho là : ");
        int a = getTongsoluong() - getSoluongmuon() ;
    }

    @Override
    public void ViTri( int floor ,String shelf) {
        // TODO Auto-generated method stub
        System.out.println(" vị trí của quyển sách là ở tầng : " +floor+ "và ở kệ: "+shelf);
    }
}
