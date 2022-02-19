class studen{
    int id;
    String name;
}

public class student_{
    public static void main(String args[]){
        studen ob1= new studen();
        studen ob2=new studen();
        ob1.id=100;
        ob1.name="Sakshi";

        ob2.id=101;
        ob2.name="Gaur";

        System.out.println(ob1.id + " "+ ob1.name);
        System.out.println(ob2.id + " "+ ob2.name);
    }
}
