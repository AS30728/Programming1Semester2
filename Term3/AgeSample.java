import java.util.Scanner;
import java.util.Calendar;

public class AgeSample {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Birth Year");
    int year = keyboard.nextInt();
    System.out.println("Birth Month");
    int month = keyboard.nextInt();
    System.out.println("Birth Day");
    int day = keyboard.nextInt();
    Calendar now = Calendar.getInstance();
    int yearAge = (now.get(Calendar.YEAR)) - year;
    int monthAge = (now.get(Calendar.MONTH)) - month;
    int dayAge = (now.get(Calendar.DATE)) - day;
    if(monthAge < 0){
      yearAge --;
      monthAge += 12;
    }
    System.out.println(yearAge + " years " + monthAge + " months and " + dayAge + " days old");
    }
}
    
    
