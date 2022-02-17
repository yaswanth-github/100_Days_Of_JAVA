public class cons_break {
    public static void main(String[] args) {
    for (int i = 1; i <= 12; i++) {
        if (i == 5){
            break;
        }
        else if(i>8 && i<11){
            continue;
        }
        System.out.println(i);
    }
}
}
