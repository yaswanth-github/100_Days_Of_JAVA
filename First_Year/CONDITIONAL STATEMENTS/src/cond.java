public class cond {
    public static void main(String args[]){
        int scores = 92;
        String nationality="Japanies";
        boolean a = (scores > 90);

        boolean b = (nationality.equals("Indian"));
        boolean c = scores > 95;
        if (scores <= 100) {
            if (!((a && b) || (!b && c))) {
                System.out.println("Output 1");
            } else {
                System.out.println("Output 2");
            }
        } else {
            System.out.println("Invalid Score");
        }
    }
}
