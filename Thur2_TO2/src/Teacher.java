public class Teacher {
    private String name;

    private int age;

    private Boolean isFemale;

    public Teacher(String tmpName,int tmpAge,Boolean tmpIsFemale){
        this.name=tmpName;
        this.age=tmpAge;
        this.isFemale=tmpIsFemale;

    }
    public String printName(){
        return name;
    }

    public String changeName(String newName){
        this.name=newName;
        return newName;

    }

}
