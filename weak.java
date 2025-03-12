// write a java program to find out the day of the weak given the number (for exaple 1, monday and 2 for tuesdAY )


import java.util.*;
public class weak{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 7 : ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                break;
        }
    }
}

