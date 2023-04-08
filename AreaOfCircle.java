public class AreaOfCircle {
    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the radius of circle");
//        int r = sc.nextInt();
//
        Circle c =new Circle();
        c.areaOfCircle(10);
    }

}
class Circle{
    double area;
    public void areaOfCircle(int r){
        area = 3.14*(r*r);
        System.out.println(area);
    }

}
