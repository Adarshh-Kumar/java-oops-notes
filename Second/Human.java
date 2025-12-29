package Second;

public class Human {
    int age;
    String degree;
    String name;
    static String college;
   public Human(String name,int age,String degree){
        this.name=name;
        this.age=age;
        this.degree=degree;
        Human.college="LPU";
    }
}
