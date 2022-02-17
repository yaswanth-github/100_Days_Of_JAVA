import java.util.Scanner;

public class vote_elg {
    public static void main(String[] args) {

        int age, vote;
        Scanner input= new Scanner(System.in);
        age=input.nextInt();
        vote=input.nextInt();
        String name = null;
        if(age>=18){

            switch(vote){
                case 1:
                    name="Ram";
                    break;
                case 2:
                    name = "Shyam";
                    break;
                case 3:
                    name="Ghanshyam";
                    break;
                default:
                    System.out.println("NOTA");
            }
        }
        else{
            System.out.println("You are not eligible");
        }
        System.out.println("You have voted for "+name);
    }
}
