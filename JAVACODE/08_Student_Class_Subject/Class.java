public class Class {
    

    private long id ;
    private String name ;
    private int year ;
    private ClassLevel level ;

    public Class( String name, int year) {
        id = IdGenerator.getNewID();
        this.name = name;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Class [id=" + id + ", name=" + name + ", year=" + year + "]";
    }
}
