public class Project extends Book implements Kho {
    public Project(int id, String name, String nhaXuatBan, int year, int sotrang, String tinhtrang, int nambaove) {
        super(id, name, nhaXuatBan, year);
        this.sotrang = sotrang;
        this.tinhtrang = tinhtrang;
        this.nambaove = nambaove;
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
    public int getNambaove() {
        return nambaove;
    }
    public void setNambaove(int nambaove) {
        this.nambaove = nambaove;
    }
    @Override
    public String toString() {
        return "Project [ sotrang=" + sotrang + ", nambaove=" + nambaove + ", tinhtrang=" + tinhtrang + "]";
    }
    int sotrang ;
    String tinhtrang ;
    int nambaove ;
    
    @Override
    public void ViTri(int floor ,String shelf) {
        // TODO Auto-generated method stub
        System.out.println(" vị trí của quyển sách là ở tầng : " +floor+ "và ở kệ: "+shelf);
    }
}
