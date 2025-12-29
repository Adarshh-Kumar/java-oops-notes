package FIRST;

class Customer{
    Customer(){
        this (12301344,"Adarsh",54);  //must be first statement
        System.out.println("Hello this is a default construsctor, from here i will call argumented constructor");
    }
    Customer(int reg,String name,int rollNo){
        System.out.println(reg+" "+name+" "+rollNo);
    }

}
public class Constructor {
    public static void main(String args[]){
        Customer cust=new Customer();
    }
}
