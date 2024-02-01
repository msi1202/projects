package gr11;
import java.util.*;
class main_DATE
{

    public static void main(){
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        DATE obj=new DATE ();
        System.out.println("Enter date,month,year");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        DATE obj2=new DATE(a,b,c);

        String s=in.nextLine();

        DATE obj3=new DATE(s);

        DATE obj4=new DATE(obj3);

        System.out.println("Validaty of the date: "+obj2.validate());

        System.out.println("Leap year? - "+obj2.leapchk());

        System.out.println("Month in words: "+obj2.monthName());

        System.out.println("Date in dd/mm/yyyy format: "+ obj2.Dispdate());

        System.out.println("Date in a long format: "+obj2.longformat());

        System.out.println("Equal Dates?- "+ obj2.equals(obj4));

        System.out.println("Comparison between dates-greater,lesser,equal: "+ obj2.compareTo(obj4));

        obj2.increment();
        System.out.println(obj2.Dispdate());
        obj2.decrement();
        System.out.println(obj2.Dispdate());
        System.out.println("Enter n days");

        int n=sc.nextInt();

        obj2.addDays(n);

        System.out.println("New date after adding n days"+obj2.Dispdate());

        System.out.println("Enter m days");
        int m=sc.nextInt();
        obj2.subdays(n);
        System.out.println("New date after subracting m days"+ obj2.Dispdate());
        System.out.println("Difference between dates: "+ obj2.diff(obj4));
    }
}