import java.util.*;
 class patient
{
 String name;
 double weight;
 double height;
 patient()
 {
 Scanner in = new Scanner(System. in);
 System.out.println("Enter your name: ");
 name = in. nextLine();

 System.out.println("Enter your weight: ");
 weight = in.nextDouble();

 System.out.println("Enter your height: ");
 height = in.nextDouble();
 }
 void BMI()
 {
 double bmi;
 bmi=(weight/(height*height))*703;
 System. out. println("You entered string "+name);
 System. out. println("Your weight is " + weight);
 System. out. println("Your height is " + height);
 System. out. println("Your bmi is " + bmi);

 }

}
 public class healthcare
 {
 public static void main(String[] args)
 {
 patient obj1 = new patient();
 obj1.BMI();
 }
 } 