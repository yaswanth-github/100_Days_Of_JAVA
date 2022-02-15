public class first_10_nat_num {
    public static void main(String[] args) {

        int num=1;
        int prod=1;
        while (num<=10)
        {
            prod= prod*num;
            num++;
            System.out.println(prod);
        }
        System.out.println(prod);
    }

}
