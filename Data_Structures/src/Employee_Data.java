class Employee{
    int empid;
    float salary;
    String ceo;
}

public class Employee_Data {

    public static void main(String[] args) {
        Employee sneha = new Employee();
        sneha.empid=12;
        sneha.salary=100000;
        sneha.ceo="Kannan";

        Employee ravi = new Employee();
        ravi.empid=11;
        ravi.salary=10000;
        ravi.ceo="Kannan";

        Employee gowtham = new Employee();
        gowtham.empid=10;
        gowtham.salary=11000;
        gowtham.ceo="Kannan";

        System.out.println(gowtham.empid+gowtham.salary+gowtham.ceo);
        System.out.println(ravi.empid+ravi.salary+ravi.ceo);
        System.out.println(sneha.empid+sneha.salary+sneha.ceo);
    }

}
