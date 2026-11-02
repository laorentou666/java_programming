abstract class Shape {
    String name;
    Shape(String name){
        this.name = name;
    }
    abstract double area();
    void describe(){
        System.out.println(name + " " + area());
    }
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        super("circle");
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{ //长方形
    private double length;
    private double width;
    Rectangle(double length,double width){
        super("长方形");
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return width * length;
    }
}
public class Stage7{
    public static void main(String[] args){
        Shape[] list = {new Circle(2),new Rectangle(1,2)};
        for(Shape s:list){
            s.describe();
        }
    }
}
