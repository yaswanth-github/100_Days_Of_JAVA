public class while_ {
    public static void main(String[] args) {

        boolean keepDriving = false;
        int currentFuel = 0;

        while (currentFuel < 5){
            keepDriving = true;
            System.out.println("Keep on driving!");
            currentFuel=currentFuel+1;
        }
        keepDriving = false;
        System.out.println("Need to refuel!");
    }
}
