public class Inherit {
    public static void main(String []args){
        child p1 = new child();
      //  Parent p2 = new Parent();
       //Parent p2  = new Parent(15);
       p1.age(p1.age);
    }
}
class  Parent{
    int age  = 20;
   // public Parent(){
     //   System.out.println("Default constructor");
   // }
    void age(int age ){
        System.out.println("age is "+ age );
    }

}
class child extends Parent{
    void age(int age){
        System.out.println("derived class age "+ age);
    }

}
