import java.util.Scanner;

public class Sphere{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    double r;
    System.out.println("Calculate the surface area & volume of a sphere.");
    System.out.println("Radius:");
    r = scn.nextDouble();
    /*System.out.println("Width:");
    w = scn.nextDouble();
    System.out.println("Height:");
    h = scn.nextDouble();
    System.out.println("Volume: " + l*w*h);
    System.out.println("Surface Area:" + 2*(w*l+h*l+h*w));*/
    System.out.println("Volume: " + (4 * Math.PI * r * r));
  } 
}
  
