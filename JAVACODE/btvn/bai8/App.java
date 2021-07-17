public class App {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Long" , 21);
        Student st2 = new Student(2, "Trang" , 21);

        Teacher tc1 = new Teacher(1 , "Long" ,1000000);
        Teacher tc2 = new Teacher(2 , "Trang" ,5000000);

        PersonController personController = new PersonController();
        personController.add(st1);
        personController.add(st2);
        personController.add(tc1);
        personController.add(tc2);
        personController.display();

    }
}
