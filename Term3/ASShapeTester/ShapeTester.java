import java.util.Scanner;

public class ShapeTester{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    double l;
    double w;
    double h;
    double r;
    String shape;
    System.out.println("Calculate the surface area & volume of a shape.");
    System.out.println("Shape"); 
    h = scn.nextDouble;
    System.out.println("Length:");
    l = scn.nextDouble();
    System.out.println("Width:");
    w = scn.nextDouble();
    System.out.println("Height:");
    h = scn.nextDouble();
    System.out.println("Volume: " + l*w*h);
    System.out.println("Surface Area:" + 2*(w*l+h*l+h*w));
  } 
}
  