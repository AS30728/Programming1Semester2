import java.util.Scanner;

public class Sphere{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    double r;
    System.out.println("Calculate the surface area & volume of a sphere.");
    System.out.println("Radius:");
    r = scn.nextDouble();
    System.out.println("Volume: " + (1.33333 * Math.PI * r * r * r));
    System.out.println("Volume: " + (4 * Math.PI * r * r));
  } 
}
  
