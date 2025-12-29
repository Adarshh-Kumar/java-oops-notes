package FIRST;

class Stud{
    int id;  //instance variables
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
    Stud(){
this.id=54;
this.name="Adarsh";
    }
}
class This {
    public static void main(String[] args){
        Stud s1=new Stud();
//        s1.id=12301344;
//        s1.name="Adarsh Kumar";
        s1.display();

    }

}
