public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.CGPA = 7;
        s1.address = "USA";
        s1.displayProperties();

        System.out.println(" ");

        Student s2= new Student();
        s2.rollno = 2;
        s2.name = "Joe";
        s2.CGPA = 8;
        s2.address = "INDIA";
        s2.displayProperties();
    }
}
