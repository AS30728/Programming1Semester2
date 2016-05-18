package pkg;
import java.util.Scanner;


public class CruelAngelsThesis {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("2-1=");
        int ans;
        ans = scn.nextInt();
        String ansString;
        switch (ans) {
            case 1:  ansString = "Yes";
                     break;
            default: ansString = "No";
                     break;
        }
        System.out.println(ansString);
    }
}