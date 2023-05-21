public class Datamatik {
    public static void main(String[] args) {

        Teacher teacher=new Teacher("Suzan",30,true);
        Student student1=new Student("Patricia",20,true,"Datamatiker");
        Student student2=new Student("Albert",18,false,"Media Design");


        System.out.println(teacher.printName());
        System.out.println(student1.printName());
        System.out.println(student1.printTeam());
        System.out.println(student2.printName());
        System.out.println(student2.printTeam());

        //opg.4
        System.out.println(teacher.changeName("Hannah"));

        //opg.5

        if(isClassMates(student1,student2)){
            System.out.println(student1+" and "+student2+" are classmates.");

        }else{
            System.out.println(student1+" and "+student2+" are NOT classmates.");
        }

    }

    public static boolean isClassMates(Student a, Student b){
        if(a.printTeam()==b.printTeam()){
            return true;


        }else{
            return false;
        }
    }
}