public class Main {
    public static void main(String[] args) {
        printHello();
        printParameter("Hello from setup");
        nameAndAge("Solomon",20);
    }
    private static void printHello(){
        System.out.println("Hello from the function");
    }
    private static void printParameter(String par){
        System.out.println(par);
    }

    private static void nameAndAge(String name,int age){
        System.out.println("My name is "+name+", I am "+age+" years old");
    }
}