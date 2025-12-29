package Second;

public class Main {
    public static void main(String args[]){
        //since they study in lpu so this property will be same for all students that will be created are static property
       Human Kunal=new Human("Kunal",21,"Btech");
       Human Karan=new Human("Karan",20,"Btech");

       System.out.println(Kunal.age);
       System.out.println(Karan.age);
       System.out.println(Karan.college); //We can acess this without even creating any object that is Karan or Kunal

    }
}