public class FunctionsReturn {
    static boolean happy = true;
    public static void main(String[] args) {

        if (iAmHappy()) {
                System.out.println("I clap my hands");
            }
            else {
                System.out.println("I don't clap my hands");
            }

        System.out.println(sumOfNumbers(12,344));
        System.out.println(bigLetters("i wish to grow one day"));



    }
    public static boolean iAmHappy() {
        if (happy) {
            return true;
        }else{
            return false;
        }
    }

    public static int sumOfNumbers(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static String bigLetters(String a){
        String capitalA=a.toUpperCase();
        return capitalA;
    }
}
