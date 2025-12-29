package FIRST;

class Student{
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
 Student(){
        System.out.println("This is a constructor");
    }
}
class manipulatingObjects {
    public static void main(String[] args){
        Student s1=new Student();
        s1.id=12301344;
        s1.name="Adarsh Kumar";
        s1.display();

    }
    
}
