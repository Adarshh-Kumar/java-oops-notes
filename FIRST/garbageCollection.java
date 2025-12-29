////Garbage Collection is automatic memeory cleanup done by JVM not by programmer
//package FIRST;
//
//public class garbageCollection {
//    class Student{
//        Stduent(){
//            System.out.println("Student Class");
//        }
//        @Override                                  //This is something that can be done by programmer when obj is being destroyed as he can't destroy obj but can tell jvm what to do when the object gets destroyed
//        protected void finalize() throws Throwable {
//            System.out.println("Being destroyed");
//        }
//    }
//    public static void main(String args[]){
//        Student s=new Student();
//
//
//    }
//}
