package temp;
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter temperature : "); 
        double temp = sc.nextDouble(); 
        System.out.print("Convert to (C/F): "); 
        char scale = sc.next().charAt(0);
        if (scale == 'F') 
            System.out.println("In Fahrenheit: " + ((temp * 9/5) + 32)); 
        else if (scale == 'C') 
            System.out.println("In Celsius: " + ((temp - 32) * 5/9)); 
            else 
                System.out.println("Invalid scale."); 
            sc.close(); 
    } 

}

