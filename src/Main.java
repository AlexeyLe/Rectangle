import Rectangle.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setSide1(10.6);
        rectangle1.setSide2(12);
        System.out.println("Area =" + " "+(rectangle1.getSide1() * rectangle1.getSide2()));
        System.out.println("Perimeter ="+""+(rectangle1.getSide1()+ rectangle1.getSide2())*2);

    }
}
