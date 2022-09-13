public class Student1 {
    int rollno;
    String name;
    double CGPA;
    String address;

    public Student1(int rollno, String name, double CGPA, String address){
        this.rollno = rollno;
        this.name = name;
        this.CGPA = CGPA;
        this.address = address;
    }

    void displayProperties(){
        System.out.println("rollno :"+rollno);
        System.out.println("name :"+name);
        System.out.println("CGPA :"+CGPA);
        System.out.println("address :"+address);
    }
}
