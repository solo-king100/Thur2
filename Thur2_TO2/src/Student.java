public class Student {

    private String name;

    private int age;

    private Boolean isFemale;

    private String datamatikerTeam;

    public Student(String tmpName,int tmpAge,Boolean tmpIsFemale,String tmpDatamatikerTeam){
        this.name=tmpName;
        this.age=tmpAge;
        this.isFemale=tmpIsFemale;
        this.datamatikerTeam=tmpDatamatikerTeam;
    }
    public String printName() {
        return name;
    }

    public String printTeam(){
        return datamatikerTeam;
    }

}
