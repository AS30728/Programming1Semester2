import java.util.Scanner;

public class Pyramid{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    double l;
    double w;
    double h;
    System.out.println("Calculate the surface area & volume of a rectangular pyramid.");
    System.out.println("Length:");
    l = scn.nextDouble();
    System.out.println("Width:");
    w = scn.nextDouble();
    System.out.println("Height:");
    h = scn.nextDouble();
    System.out.println("Volume: " + (l*w*h)/3 );
    System.out.println("Surface Area: " + (l*w)+l*Math.sqrt(((w/2)*(w/2))+(h*h))+w*Math.sqrt(((l/2)*(l/2))+(h*h)));
  } 
}