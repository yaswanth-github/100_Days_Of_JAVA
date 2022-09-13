public class F2 {
    int rollno;
    String name;
    double CGPA;
    String address;

    public F2(int newRollNo, String newName, double newCGPA, String newAddress){
        rollno = newRollNo;
        name = newName;
        CGPA = newCGPA;
        address = newAddress;
    }

    void displayProperties(){
        System.out.println("rollno :"+rollno);
        System.out.println("name :"+name);
        System.out.println("CGPA :"+CGPA);
        System.out.println("address :"+address);
    }

}
