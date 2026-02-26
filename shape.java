class Shape{
    void area(){
        System.out.println("Area Calculation");
    }
}
class Rectangle extends Shape{
    int length=10, breadth=5;
    void area(){
        System.out.println("Rectangle area:" +(length*breadth));
    }
}
class Circle extends Shape{
    double radius=7;
    void area(){
        System.out.println("Circle area:" +(3.14*radius*radius));
    }
}
class Square extends Shape{
    int side=4;
    void area()
    {
        System.out.println("Square area:" +(side*side));
    }
}
public class main(){
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Square s=new Square();
        r.area();
        c.area();
        s.area();
    }
}