public class InteresCompuestp {
    public static void main(String[] args) {
        double a=50.00;

        for(int j=0;j<365;j++){
            a=a + a*0.01;
        }

        System.out.println(a);
    }
}
